import jdk.jshell.spi.ExecutionControl;
import org.jetbrains.annotations.Contract;

import java.util.ArrayList;

public class LexiconEntry {
    private String f_name;
    private String l_name;
    private String n_name;
    private boolean is_homo;
    private static ArrayList<LexiconEntry> entries = new ArrayList<>();

    @Contract(pure = true)
    public LexiconEntry(String f_name, String l_name, String n_name, boolean is_homo) throws UserException {
        if(f_name.length() == 0) throw new UserException(UserException.NO_F_NAME);
        if(l_name.length() == 0) throw new UserException(UserException.NO_L_NAME);
        this.f_name = f_name;
        this.l_name = l_name;
        this.n_name = n_name;
        this.is_homo = is_homo;
    }

    public static void add(LexiconEntry entry){
        entries.add(entry);
    }

    @Override
    public String toString() {
        return "LexiconEntry{" +
                "f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", n_name='" + n_name + '\'' +
                ", is_homo=" + is_homo +
                '}';
    }

    public static void printAllEntries(){
        entries.forEach((entry -> System.out.println(entry + " ")));
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getN_name() {
        return n_name;
    }

    public void setN_name(String n_name) {
        this.n_name = n_name;
    }

    public boolean isIs_homo() {
        return is_homo;
    }

    public void setIs_homo(boolean is_homo) {
        this.is_homo = is_homo;
    }
}
