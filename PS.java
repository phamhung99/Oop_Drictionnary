import java.util.Scanner;

public class PS {
    private int ts,ms;

    public int getTs()
    {

        return ts;
    }
    public void setTs(int ts )
    {

        this.ts = ts;
    }
    public int getMs()
    {
        return ms;
    }
    public void setMs(int ms )
    {
        this.ms = ms;
    }
    // ham khoi tao co tham so
    public PS  (int ts, int ms)
    {
        this.ts = ts;
        this.ms = ms;
    }
    // ham in phan so
    public  void inPhanso(PS a)
    {
        System.out.print(a.getTs() + "/" + a.getMs() +"\n");
    }
    // ham cong phan so
    public  PS congPhanso (PS a)
    {
            this.ts = this.ts * a.getMs() + this.ms * a.getTs();
            this.ms = this.ms * a.getMs();
            return this;
    }
    // ham tru phan so
    public  PS truPhanso (PS a)
    {
        this.ts = this.ts * a.getMs() - this.ms * a.getTs();
        this.ms = this.ms * a.getMs();
        return this;
    }
    // ham nhan phan so
    public  PS nhanPhanso (PS a)
    {
        this.ts = this.ts * a.getTs();
        this.ms = this.ms * a.getMs();
        return this;
    }
    // ham chia phan so
    public  PS chiaPhanso (PS a)
    {
        this.ts = this.ts * a.getMs();
        this.ms = this.ms * a.getTs();
        return this;
    }
    // ham so sanh 2 phan so
    public boolean equals(PS a)
    {

        boolean kq = false;

            if ( this.ts * a.getMs() == this.ms * a.getTs() ) kq = true;
        return kq;
    }
    public static void main(String[] args)
    {

        Scanner inPut = new Scanner(System.in);

        PS a = new PS(1,2);
        PS b = new PS(1,3);

        PS c = a.truPhanso(b);
        c.inPhanso(c);


        boolean kq = a.equals(b);
        System.out.print(kq);
    }
}
