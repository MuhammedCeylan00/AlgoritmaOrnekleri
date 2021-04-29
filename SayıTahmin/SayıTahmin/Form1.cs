using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SayıTahmin
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        int BulunacakSayi = 8;
        int sayac = 0;
        private void button1_Click(object sender, EventArgs e)
        {
            sayac++;
            int sayi = Convert.ToInt32(textBox1.Text);

            if (sayi > BulunacakSayi)
            {
                label2.Text = "Daha küçük tahmin ediniz";
            }
            else if (sayi < BulunacakSayi)
            {
                label2.Text = "Daha büyük tahmin ediniz";
            }
            else if (BulunacakSayi == sayi)
            {
                label2.Text = "Tebrikler " + sayac + ". tahminde bildiniz";
            }
        }
    }
}
