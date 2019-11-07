# Tests

This file contains my answers to Programming on JVM's midterm's theoretical part.

## Questions and Answers

### 1.	რა არის JVM? 
Java Virtual Machine (JVM) არის ვირტუალური მანქანა, რომელიც ‘უშვებს’ ჯავას ბაიტკოდს. თითოეული ჯავას წყარო(source) ფაილი კომპილირდება ბაიტკოდში, რომელიც ‘ეშვება‘ ზუსტად JVM-ით. 

### 2.	რა არის JDK?
Java Development Kit (JDK) კომპილატორებისა და ხელსასწყოების (როგორიცაა JavaDoc და Java Debugger) მთლიანი ნაკრებია, მისი მეშვეობით მომხმარებელს შეუძლია დაწეროს, დააკომპილიროს და გაუშვას ჯავას აპლიკაციები.

### 3.	რა არის პრიმიტივი?
ჯავაში მონაცემთა ძირითადი და მარტივი ტიპია პრიმიტივი.  ის განსაზღვრავს ცვლადის მნიშვნელობისთვის ზომასა და ტიპს და სხვა დამატებითი მეთოდი არ აქვს. ყველა ერთი ტიპის პრიმიტივი ერთი ზომისაა, ანუ ყველა int ტიპის ცვლადი იყენებს 32 ბიტს. ჯავაში გამოიყოფა მონაცემთა 8 პრიმიტიული ტიპი: byte, short, int, long, float, double, boolean, char. 

### 4.	რა განსხვავებაა პრიმიტივსა და ობიექტს შორის?
ჯავაში მონაცემთა ძირითადი და მარტივი ტიპია პრიმიტივი.  ის განსაზღვრავს ცვლადის მნიშვნელობისთვის ზომასა და ტიპს და სხვა დამატებითი მეთოდი არ აქვს. ყველა ერთი ტიპის პრიმიტივი ერთი ზომისაა, ანუ ყველა int ტიპის ცვლადი იყენებს 32 ბიტს. ჯავაში გამოიყოფა მონაცემთა 8 პრიმიტიული ტიპი: byte, short, int, long, float, double, boolean, char. 

გარდა პრიმიტივებისა, ჯავაში შესაძლებელია ახალი ტიპის ცვლადების შექმნა კლასების გამოყენებით. კლასის ინსტანსს - ობიექტს, მშობელი კლასის ყველა მეთოდი და ატრიბუტი გააჩნია. 

განსხვავებულია პრიმიტივისა და ობიექტის შექმნაც. პრიმიტივი long x; ხოლო ობიექტის შესაქმნელად გამოიყენება ქივორდი ‘new’.
ასევე ლოკალური პრიმიტივები და რეფერენსები ინახება სტეკში, ხოლო თავად ობიექტები ჰიპში. 

### 5.	რატომ ეძახიან JAVA-ს მულტიპლატფორმულ პროგრამირების ენას?
ჯავა ისეა შექმნილი, რომ ნებისმიერ დაწერილ აპლიკაციას აძლევს საშუალებას გაეშვას ნებისმიერ მხარდაჭერილ პლატფორმაზე ახლიდან გადაწერის ან კომპილაციის გარეშე. ამ ყველაფერში დიდ როლს ასრულებს ჯავას ვირტუალური მანქანა. 

### 6.	რა არის ნაკადი?
ნაკადი კონტროლის მიმდევრობითი დინებაა პროგრამაში. (ინგლისურად უკეთესად ჟღერს: a single sequential flow of control within a program.)

### 7.	რამდენი ხერხით შეიძლება ნაკადის შექმნა?
ნაკადის შექმნის 2 გზა არსებობს:
1. Thread კლასის მემკვიდრე კლასის შექმნით. 
2.  Runnable ინტერფეისის გამომყენებელი კლასის შექმნით. 

### 8.	აღწერეთ ნაკადის სასიცოცხლო ციკლი.
![Thread Lifecycle](https://www.tutorialspoint.com/java/images/Thread_Life_Cycle.jpg)
* New - იქმნება ახალი ნაკადი;
* Runnable - მზადაა გასაშვებად;
* Running - ეშვება კოდი ნაკადზე;
* Waiting - ელოდება სხვა რომელიმე გაშვებული პროცესის დამთავრებას;
* Dead -  ნაკადი მთავრდება. 

### 9.	რას ეწოდება ინკაფსულაცია?
ინკაფსულაცია ერთგვარი მექანიზმია, რომელიც კოდს აკავშირებს იმ მონაცემებთან, რომლებთანაც მუშაობს და ასევე იცავს გარე ჩარევებისა და უნებართვო მიმართვებისგან. OOP-ის ერთ-ერთი მთავარი კონცეფციაა და იცავს ჩვენი კოდისა და მონაცემების უსაფრთხოებას. 

### 10.	რას ეწოდება მემკვიდრეობითობა?
მემკვიდრეობითობა იერარქიული კლასიფიკაციის ნაწილია და ესაა პროცესი, როდესააც ერთი ობიექტი იღებს მეორე ობიექტის ატრიბუტებს/თვისებებს. მის გარეშე თითოეული ობიექტისთვის საჭირო იქნებოდა ყველა თვისების აღწერა. მემკვიდრეობითობის წყალობით კი შესაძლებელია მხოლოდ განხვავებული თვისებების აღწერა. 

მემკვიდრეობითობა ინკაფსულაციასთანაცაა დაკავშირებული, რადგან მშობელი კლასის ინკაფსულირებული ატრიბუტები, ექნება მის შვილობილ კლასებსაც. 
ასევე შვილობილ კლასს მხოლოდ ერთი მშობელი კლასი შეიძლება ჰყავდეს, ხოლო მშობელ კლასს შესაძლებელია ერთი ან მეტი შვილობილი კლასი ჰყავდეს. 

### 11.	რას ეწოდება პოლიმორფიზმი?
პოლიმორფიზმი OOP-ის ერთ-ერთი მთავარი კონცეფციაა და ობიექტის მრავალნაირობას გულისხმობს. პოლიმორფიზმის მაგალითებია: მეთოდების overriding და overloading. 

Overriding-ია, როცა შვილობილ კლასს მშობელი კლასის მეთოდი აქვს თავისი იმპლემენტაციით. ასეთ დროს აუცილებელია მეთოდს ზუსტად იგივე სახელი და იმავე ტიპის პარამეტრები ჰქონდეს, რაც აქვს მშობელ კლასში. 

Overloading-ი კი საშუალებას გვაძლევს კლასში ერთი და იმავე სახელით გვქონდეს რამდენიმე მეთოდი. არსებობს 3 გზა მეთოდის overloading-ისთვის: 1) როცა პარამეტრების განსხვავებული რაოდენობა გვჭირდება; 2) როცა განსხვავებული ტიპის პარამეტრები გვჭირდება; 3) როდესაც პარამეტრების განსხვავებული მიმდევრობა გვჭირდება. აუცილებელია ყველა მეთოდი ერთსა და იმავე ტიპს აბრუნებდეს.

### 12.	რას ეწოდება სტეკი?
სტეკი არის მონაცემთა სტრუქტურა, რომელიც გამოიყენება ელემენტების შესანახად LIFO (Last In First Out) პრინციპით. მასში ინახება ლოკალური ცვლადები და მიმთითებლები. 

### 13.	რას ეწოდება ჰიპი?
ჰიპი არის მეხსიერების სივრცე, სადაც ნებისმიერი შექმნილი ობიექტი ინახება. 

### 14.	რა არის Garbage Collection?
Garbage Collection არის ავტომატური პროცესი, რომლის მიზანიცაა ისეთი ობიექტების აღმოჩენა და ჰიპის მისგან გასუფთავება, რომელიც პროგრამას აღარ სჭირდება. 

### 15.	რას ეწოდება კონსტრუქტორი?
კონსტრუქტორი სპეციალური მეთოდია, რომელიც კლასის ობიექტს უკეთებს ინიციალიზაციას. აუცილებელია, რომ კლასის და კონსტრუქტორის სახელი იყოს ერთი და იგივე. 

### 16.	რა განსხვავება კლასის მეთოდსა და კლასის წევრს შორის?
კლასის მეთოდს შეიძლება ჰქონდეს ნებისიერი წვდომის მოდიფიკატორი, ხოლო კლასის წევრი არ არის უბრალოდ კლასის ცვლადი. მასზე წვდომა ხორციელდება კლასის სახელით, რაც ნიშნავს რომ ის არის კლასის სტატიკური ცვლადი.

### 17.	რას ეწოდება Package?
Package ჯავაში გამოიყენება დაკავშირებული კლასების დასაჯგუფებლად. მას შეგვიძ₾ია როგორც ფაილების დირექტორიის ფოლდერს, ისე შევხედოთ. მისი დახმარებით შეგვიძლია სახელების დარქმევისას კონფლიქტი ავიცილოთ თავიდან. არი 2 კატეგორიის package: ჩაშენებული და მომხმარებლის მიერ განსაზღვრული. 

### 18.	რა განსხვავებაა final კლასსა და abstract კლასს შორის?
Final კლასის ქვეკლასის შექმნა არ შეიძლება და მისი ყველა მეთოდს კლასშივე უნდა ჰქონდეს იმპლემენნტაცია. ხოლო აბსტრაქტული კლასს თითქმის ყოველთვის ჰყავს მემკვიდრე კლასი, რომლის შიგნითაც ხდება მისი აბსტრაქტული მეთოდების იმპლემენტაცია. 

### 19.	რას ეწოდება გამონაკლისი შემთხვევა?
გამონაკლისი შემთხვევა არის არასასურველი ან მოულოდნელი ივენთი, რომლიც რან თაიმის დროს იჩენს თავს და პროგრამის ნორმალურ მსვლელობას უშლის ხელს. არის 2 ტიპის: checked - რომელიც მოწმდება კომპილაციის დროს; unchecked - კი არ მოწმდება კომპილაციის დროს. ასეთია მაგალითად RuntimeException.  

### 20.	რამდენი ხერხით შეიძლება გამონაკლისი შემთხვევის დამუშავება?
Try/catch/finally ბლოკები შეგვიძლია გამოვიყენოთ ასევე throwable მეთოდები გავწეროთ.

### 21.	რას ეწოდება ინტერფეისი?
ინტერფეისი არის აბსტრაქტული კლასის მსგავსი, რომელიც გამოიყენება დაკავშირებული ცარიელი ტანის მქონე მეთოდების დასაჯგუფებლად. ის აუცილებელია იყოს „implemented“ (implements ქივორდის გამოყენებით სხვა კლასის მიერ). 

### 22.	რა განსხვავებაა ინტერფეისსა და აბსტრაქტულ კლასს შორის?
ინტერფესისსა და აბსტრაქტულ კლასს შორის არის რამდენიმე ძირითადი განსხვავება:

* ინტერფეისის დაიმპლემენტება ხდება ქივორდით implements, ხოლო აბსტრაქტული კლასის მემკვიდრე კლასის შექმნა ქივორდით extends. 

* ინტერფეისს აქვს მხოლოდ აბსტრაქტული მეთოდები, აბსტრაქტულ კლასს კი როგორც აბსტრაქტული ასევე არააბსტრაქტული მეთოდები.

* ცვლადები ინტერფეისში არის ფაინალ ცვლადები, ხოლო აბსტრაქტულ კლასს შეუძლია ჰქონდეს არაფაინალ ცვლადებიც.

* ინტერფეისის წევრები დეფოლტად ფაბლიქია, ხოლდ აბსტრაქტულ კლასს შეუძლია ჰქონდეს ფრაივით, ფროთექთიდ  და ა.შ. 

### 23.	რა განსხვავება public და protected მოდიფიკატორებით განსაზღვრულ კლასის წევრებს შორის?
* Public - მარტივად რომ ვთქვათ, წვდომადია ყველასთვის. 
* Protected - წვდომადია კლასის წევრებისთვის, ასევე შვილობილი კლასებისთვისაც იმავე და ასევე სხვა ფექიჯშიც კი.

### 24.	რა განსხვავება public მოდიფიკატორსა და მოდიფიკატორის გარეშე განსაზღვრულ კლასის წევრს შორის? 
* Public - მარტივად რომ ვთქვათ, წვდომადია ყველასთვის. 
* No modifier - წვდომადია კლასის წევრებისთვის, ასევე შვილობილი კლასებისთვისაც და ასევე წვდომადია იმავე ფექიჯში.

### 25.	რა განსხვავება სტეკსა და ჰიპს შორის?
სტეკი არის მონაცემთა სტრუქტურა, რომელიც გამოიყენება ელემენტების შესანახად LIFO (Last In First Out) პრინციპით. მასში ინახება ლოკალური ცვლადები და მიმთითებლები. 

ჰიპი არის მეხსიერების სივრცე, სადაც ნებისმიერი შექმნილი ობიექტი ინახება. გამოიყენება აპლიკაციის ყველა ნაწილისთვის, ხოლო სტეკი მხოლოდ ერთი ნაკადისთვის. 

სტეკი როდესაც ივსება, ჯავა რანთაიმი ‘ისვრის’ java.lang.StackOverFlowerror-ს, ხოლოდ ჰიპი როდესაც სავსეა, java.lang.OutOfMemoryError: Java Heap Space-ს. 

### 26.	რა განსხვებაა FileWriter და BufferedWriter კლასების გამოყენებას შორის?
* FileWriter არის ყველაზე მარტივი გზა ჯავაში ფაილში ჩასაწერად. Overloaded write მეთოდის დახმარებით შეგვიძლია ჩავწეროთ ბაიტი, ინტი და მასივი ფაილში. პირდაპირ თითოეულ სიმბოლოს წერს ფაილში, ამიტომაც უმჯობესია გამოვიყენოთ მაშინ როცა ფაილში იშვიათად ვწერთ.
* BufferedWriter FileWriter-ის მსგავსია, თუმცა ის იყენებს შიდა ბუფერს მონაცემების ჩასაწერად ფაილში. ასე რომ როცა ჩაწერა ხშირად ხდება ფაილში, I/O ოპერაციები ნაკლებია და შედეგად პროგრამის ქმედება უკეთესია. 

### 27.	რას ეწოდება Thread sheduler? 
Thread scheduler JVM-ის ნაწილია და განსაზღვრავს რომელი ნაკადი უნდა გაეშვას.

### 28.	რა საფრთხე არსებობს ნაკადებთან მუშაობის დროს?
ნაკადებთან მუშაობისას პრობლემებს შეიძლება  წავაწყდეთ საერთო რესურსების გამოყენებისას. Deadlock-ის დროს ორი ან მეტი ნაკადი იბლოკება სამუდამოდ, ისინი ერთმანეთს ელოდებიან, შესაბამისად არცერთი არ აგრძელებს მუშაობას. 