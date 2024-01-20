package javase_8;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Object {

    public static void main(String[] args) {

        // Create a list of phone objects
        List<Phone> phones = List.of(
            new Phone("achuth", List.of(9502212128L, 9110562439L)),
            new Phone("Ramana", List.of(9553216143L, 9398862344L))
        );

        // Print the name and phone numbers of each phone object
        phones.forEach(phone -> System.out.println(phone.getName() + " " + phone.getPhnNum()));

        // Use the flatMap() operation to flatten the list of phone numbers into a single list of phone numbers
        List<Long> phoneNumbers = phones.stream().map(Phone::getPhnNum).flatMap(Collection::stream).collect(Collectors.toList());

        // Print the flattened list of phone numbers
        System.out.println(phoneNumbers); // [9502212128, 9110562439, 9553216143, 9398862344]

        // Use the flatMap() operation to flatten the list of phone numbers into a single list of phone numbers, and prepend the string "+91-" to each phone number
        List<String> phoneNumbersWithCountryCode = phones.stream().map(Phone::getPhnNum).flatMap(Collection::stream)
                .map(num -> "+91-" + num).collect(Collectors.toList());

        // Print the flattened list of phone numbers with country code
        System.out.println(phoneNumbersWithCountryCode); // [+91-9502212128, +91-9110562439, +91-9553216143, +91-9398862344]

    }

}

