package Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        //throw new UnsupportedOperationException();
        //If the array is empty, throw new NoSuchElementException.

        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom."); //Dersom arrayet er tomt.
        }
        int maksVerdi = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[maksVerdi]) {
                bytt(a, maksVerdi, i);
            }
            maksVerdi++;
        }

        return a[a.length - 1];
    }

    public static void bytt(int[] a, int i, int j) {
        int vals = a[i];
        a[i] = a[j];
        a[j] = vals;
    }

    public static int ombyttinger(int[] a) {
        //throw new UnsupportedOperationException();
        int antallOmbyttinger = 0;
        int vals = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[vals]) {
                bytt(a, vals, i);
                antallOmbyttinger++;
            }
            vals++;
        }
        return antallOmbyttinger;
    }


    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        int antallUlike = 1; // antall
        int vals = 0;
        if (a.length == 0) {
            return 0;
        }

        for (int i = 1; i < a.length; ++i) {
            if (a[i] < a[vals]) {
                throw new IllegalStateException("Arrayet er ikke sortert stigende.");
            }else if(a[i] != a[vals]){
                antallUlike++;
            }
            vals++;
        }

        return antallUlike;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        //throw new UnsupportedOperationException();
        if(a.length == 0){
            return 0;
        }
        int unikeNummer = 1;


        for (int i = 1; i < a.length; i++) {
            int j=0;
            for (j = 0; j < i; j++)
                if (a[i] == a[j]) {
                    break;
                }
                if(i == j){
                    unikeNummer++;
                }


        }
        return unikeNummer;
    }


    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
      //throw new UnsupportedOperationException();
        int venstre = 0;
        int hoyre =a.length-1;
        if(bareOddetall(a)){
            Arrays.sort(a);
        }
        if(barePartall(a)){
            Arrays.sort(a);
        }
        int antallOddetall = 0;
        while(venstre < hoyre){
            while(a[venstre] % 2 != 0 && venstre < hoyre){
                antallOddetall++;
                venstre++;
            }
            while(a[hoyre] % 2== 0 && venstre < hoyre){
                hoyre--;

            }
            if(venstre < hoyre){
                bytt(a, venstre, hoyre);
            }
        }
        Arrays.sort(a, 0, antallOddetall);
        Arrays.sort(a, antallOddetall, a.length);
    }
    public static boolean bareOddetall(int [] a){
        boolean bareOddetall = true;
        for(int i : a){
            if(i % 2 == 0){
                bareOddetall = false;
                break;
            }
        }
        return bareOddetall;
    }
    public static boolean barePartall(int [] a){
        boolean barePartall = true;
        for(int i : a){
            if(i % 2 == 1){
                barePartall = false;
                break;
            }
        }
        return barePartall;
      }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        //throw new UnsupportedOperationException();

        if (a.length >= 3) {
            char temp = a[0];
            char vals = a[1];
            for (int i = 1; i < a.length; i++) {
                a[i] = temp;
                temp = vals;
                if (i != a.length - 1) {
                    vals = a[i+1];
                }
            }
            a[0] = vals;
        } else if (a.length == 2) {
            CharBytt(a, 0, 1);
        }
    }
    public static void CharBytt(char [] a, int i, int j){
        char temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        //throw new UnsupportedOperationException();
        String utskrift = "";

        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            utskrift += s.charAt(i++);
            utskrift += t.charAt(j++);
        }
        while(i < s.length()){
            utskrift += s.charAt(i++);
        }
        while(j < t.length()){
            utskrift += t.charAt(j++);
        }


        return utskrift;
    }

    /// 7b)
    public static String flett(String... s) {
        //throw new UnsupportedOperationException();
        String utskrift = "";
        int vals = 0;
        while(lengsteString(s) >= vals){
            for(String innhold : s){
                if(innhold.length() > vals){
                    utskrift += innhold.charAt(vals);
                }

            }
            vals++;
        }
        return utskrift;
    }
    public static int lengsteString(String... s){
        int maxLengde = 0;
        for(String i : s){
            if(i.length() > maxLengde){
                maxLengde = i.length();
            }
        }
        return maxLengde;
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
