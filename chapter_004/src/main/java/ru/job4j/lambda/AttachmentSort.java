package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );

        Comparator comparator =  new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        // Здесь создайте компаратор на основании анонимного класса.


        Comparator<Attachment> nameComparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {

                int rsl = 0;
                for (int i = 0; i < Integer.min(o1.getName().length(), o2.getName().length()); i++) {
                    rsl = Character.compare(o1.getName().charAt(i), o2.getName().charAt(i));
                    if (rsl != 0) {
                        return rsl;
                    }
                }
                rsl = o1.getName().length() - o2.getName().length();
                return rsl;
            }
        };

        attachments.sort(nameComparator);
        System.out.println(attachments);

    }
}
