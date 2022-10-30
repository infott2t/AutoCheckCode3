package org.example.swinggui.v2;

public class TexttingC {




    private static String sys02InitTextDefault ="Class Name/ Type \n" +
        "\n" +
        "\n" +
        " Focusing Method... | yyyy/mm/dd HH:SS | Notice\n" +
        "\n" +
        "\n" +
        " Methods...";

    public static String sys02ForExampleBuilderCheck = "Reciept03\t\t\t\t\n" +
            "\t\t\tFocusing Table... | 2022-10-31 HH:SS \n" +
            "\n" +
            "Builder Check. \t\tinsert1.\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Table Name...\tReciept03\n" +
            "\n" +
            "\n" +
            "ClassName\t\tTable insert1\t\tBuilderCheck.\t\t \t\t\t\t\n" +
            "\n" +
            "Reciept03Service\tinsertReciept()\t\treciept03 = Reciept03.builder()\n" +
            "\t\t\t\t\t.count(Here)\n" +
            "\t\t\t\t\t.group(0L)\n" +
            "\t\t\t\t\t.\n" +
            "\t\t\t\t\t.\n" +
            "\t\t\t\t\t.build();\n";

    public static String sys02ForExampleTableFocusing2 = "Reciept03\t\n" +
            "\t\tFollow Down side.\n" +
            "\n" +
            " Focusing Table... | 2022-10-31 HH:SS | Notice\n" +
            "\n" +
            "\n" +
            "Table Name...\tReciept03\t\t\n" +
            "\n" +
            "insertReciptByCusId()\n" +
            "\t\n" +
            "searchUpdateInit()\t\n" +
            "searchUpdateCountProduct()\t\t\n" +
            "searchUpdateRecieptNumber()\t\t\n" +
            "searchUpdateOrderNumber()\t\t\n" +
            "searchUpdateC()\t\n" +
            "searchUpdateD()\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "=== Deep dive.\n" +
            "\n" +
            "\tinsertReciptByCusId(cus01, dto, cart)\n" +
            "\n" +
            "\tsearchUpdateInit()\t\n" +
            "\tsearchUpdateCountProduct(productNumber, count)\t\t\n" +
            "\tsearchUpdateRecieptNumber(recieptNumber)\t\t\n" +
            "\tsearchUpdateOrderNumber(orderNumber)\t\t\n" +
            "\tsearchUpdateC()\t\n" +
            "\tsearchUpdateD()\n" +
            "\t \n";

    public static String sys02ForExampleTableFocusing1 = "Reciept03\t Table.\t\n" +
            "\n" +
            "\n" +
            " Focusing Table... | 2022-10-31 HH:SS | Notice\n" +
            "\n" +
            "\n" +
            "Table Name...\tReciept03\t\t\t\tBBBController\t\tBBBController\t\t\tBBBController\t\t\tBBController\t\t\tBBBController\t\tBBBController\n" +
            "\n" +
            "\t\tTable insert1\t\t\tTable Update2\t\tTable Update3\t\t\tTable Update4\t\t\tTable Update5 \t\t\tTable Update6\t\tTable Update7   \t\t\t\t\n" +
            "\n" +
            "RestController\t\tsearch_ByUserId()\t\t\n" +
            "\t\t\n" +
            "\t\tinsertReciptByCusId()\t\tsearchUpdateInit()\tsearchUpdateCountProduct()\t\tsearchUpdateRecieptNumber()\t\tsearchUpdateOrderNumber()\t\tsearchUpdateC()\tsearchUpdateD()\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Down side.\n" +
            "\n" +
            "insertReciptByCusId()\n" +
            "\t\n" +
            "searchUpdateInit()\t\n" +
            "searchUpdateCountProduct()\t\t\n" +
            "searchUpdateRecieptNumber()\t\t\n" +
            "searchUpdateOrderNumber()\t\t\n" +
            "searchUpdateC()\t\n" +
            "searchUpdateD()";
    public static String sys02ForExampleTableFocusing = "Class Name/ Type \n" +
            "\n" +
            "\n" +
            " Focusing Table... | 2022-10-31 HH:SS | Notice\n" +
            "\n" +
            "\n" +
            "Table Name...\tReciept03\n" +
            "\n" +
            "\t\tTable insert1\t\tTable Update2\t\tTable Update3\t\tTable Update4\t\tTable Update5    \t\t\t\t\n" +
            "\n" +
            "Reciept03Service\tthis.insertReciept()\tupdateReciept()\n" +
            "\n";
    public static String sys02InitTextDefault2 ="Class Name/ Type \n" +
        "\n" +
        "\n" +
        " Focusing Table... | yyyy/mm/dd HH:SS | Notice\n" +
        "\n" +
        "\n" +
        "Table Name...\n" +
            "\t\tTable insert1\t\tTable Update2\t\tTable Update3\t\tTable Update4\t\tTable Update5    \n"+
            "Class/Method...\n"+
            "\n"
            ;


    private static String sys02InitText0 = " Class Name/ Type \n" +
            "\n" +
            "\n" +
            " Focusing Method... | yyyy/mm/dd HH:SS | Notice\n" +
            "\n" +
            "\n" +
            "\n Methods, Rule type A"+
            "\n 1. return method Name: ex) ManList listing() "+
            "\n 2. inner logic rule fix programing : " +
            "\n" +
            "\n ex) Long and change String.  Vari: int[] manTall -> Long[] manTallLong\n"+
            "\n Long[] manTallLong = new Long[manTall.length];" +
            "\n for(int i=0; i< manTall.length; i++){ manTallLong[i] = Long.Long.valueOf(manTall[i])}"+
            "\n  "+
            "\n (so, Like this.... so I not test this example coding.)"+
            "\n "+
            "\n "+
            "\n     ManList listing() "+
            "\n"+
            "\n                             Methods, Rule type A"+
            "\n                             RULE METHOD IN FIRST,  Change Int -> Long." +
            "\n                             EXPLANATE::                                                                                                                                                          Long and change String.  Vari: int[] manTall -> Long[] manTallLong  Long[] manTallLong = new Long[manTall.length];" +
            "\n"+
            "\n                             DEFAULT CODE WRITE : " +
            "\n                                                  for(int i=0; i< .length; i++){ VRIABLE_INT[i] = Long.valueOf(VARIABLE_LONG[i])}" +
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n "+
            "\n ";;


    TexttingC() {

    }


}
