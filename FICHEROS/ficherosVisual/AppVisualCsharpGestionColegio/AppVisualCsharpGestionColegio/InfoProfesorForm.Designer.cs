namespace AppVisualCsharpGestionColegio
{
    partial class InfoProfesorForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(InfoProfesorForm));
            this.label1 = new System.Windows.Forms.Label();
            this.idComboBox = new System.Windows.Forms.ComboBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.idTbDniInfoProfesor = new System.Windows.Forms.TextBox();
            this.idTbNombreInfoProfesor = new System.Windows.Forms.TextBox();
            this.idTbDireccionInfoProfesor = new System.Windows.Forms.TextBox();
            this.idTbTlfnInfoProfesor = new System.Windows.Forms.TextBox();
            this.idTbEstudiosInfoProfesor = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(180, 125);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(31, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "DNI";
            // 
            // idComboBox
            // 
            this.idComboBox.FormattingEnabled = true;
            this.idComboBox.Location = new System.Drawing.Point(29, 118);
            this.idComboBox.Name = "idComboBox";
            this.idComboBox.Size = new System.Drawing.Size(145, 24);
            this.idComboBox.TabIndex = 1;
            this.idComboBox.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(289, 248);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(35, 17);
            this.label2.TabIndex = 2;
            this.label2.Text = "DNI:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(289, 293);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(72, 17);
            this.label3.TabIndex = 3;
            this.label3.Text = "NOMBRE:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(289, 336);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(86, 17);
            this.label4.TabIndex = 4;
            this.label4.Text = "DIRECCIÓN:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(289, 380);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(87, 17);
            this.label5.TabIndex = 5;
            this.label5.Text = "TELÉFONO:";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(289, 424);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(82, 17);
            this.label6.TabIndex = 6;
            this.label6.Text = "ESTUDIOS:";
            // 
            // idTbDniInfoProfesor
            // 
            this.idTbDniInfoProfesor.Location = new System.Drawing.Point(415, 248);
            this.idTbDniInfoProfesor.Name = "idTbDniInfoProfesor";
            this.idTbDniInfoProfesor.Size = new System.Drawing.Size(202, 22);
            this.idTbDniInfoProfesor.TabIndex = 7;
            // 
            // idTbNombreInfoProfesor
            // 
            this.idTbNombreInfoProfesor.Location = new System.Drawing.Point(415, 288);
            this.idTbNombreInfoProfesor.Name = "idTbNombreInfoProfesor";
            this.idTbNombreInfoProfesor.Size = new System.Drawing.Size(202, 22);
            this.idTbNombreInfoProfesor.TabIndex = 8;
            // 
            // idTbDireccionInfoProfesor
            // 
            this.idTbDireccionInfoProfesor.Location = new System.Drawing.Point(415, 331);
            this.idTbDireccionInfoProfesor.Name = "idTbDireccionInfoProfesor";
            this.idTbDireccionInfoProfesor.Size = new System.Drawing.Size(202, 22);
            this.idTbDireccionInfoProfesor.TabIndex = 9;
            // 
            // idTbTlfnInfoProfesor
            // 
            this.idTbTlfnInfoProfesor.Location = new System.Drawing.Point(415, 375);
            this.idTbTlfnInfoProfesor.Name = "idTbTlfnInfoProfesor";
            this.idTbTlfnInfoProfesor.Size = new System.Drawing.Size(202, 22);
            this.idTbTlfnInfoProfesor.TabIndex = 10;
            // 
            // idTbEstudiosInfoProfesor
            // 
            this.idTbEstudiosInfoProfesor.Location = new System.Drawing.Point(415, 419);
            this.idTbEstudiosInfoProfesor.Name = "idTbEstudiosInfoProfesor";
            this.idTbEstudiosInfoProfesor.Size = new System.Drawing.Size(202, 22);
            this.idTbEstudiosInfoProfesor.TabIndex = 11;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(541, 459);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 12;
            this.button1.Text = "LIMPIAR";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // InfoProfesorForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(128)))));
            this.BackgroundImage = global::AppVisualCsharpGestionColegio.Properties.Resources.scroll_307481_960_720;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.ClientSize = new System.Drawing.Size(912, 725);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.idTbEstudiosInfoProfesor);
            this.Controls.Add(this.idTbTlfnInfoProfesor);
            this.Controls.Add(this.idTbDireccionInfoProfesor);
            this.Controls.Add(this.idTbNombreInfoProfesor);
            this.Controls.Add(this.idTbDniInfoProfesor);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.idComboBox);
            this.Controls.Add(this.label1);
            this.DoubleBuffered = true;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "InfoProfesorForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "CONSULTA PROFESOR";
            this.Load += new System.EventHandler(this.InfoProfesorForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox idComboBox;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox idTbDniInfoProfesor;
        private System.Windows.Forms.TextBox idTbNombreInfoProfesor;
        private System.Windows.Forms.TextBox idTbDireccionInfoProfesor;
        private System.Windows.Forms.TextBox idTbTlfnInfoProfesor;
        private System.Windows.Forms.TextBox idTbEstudiosInfoProfesor;
        private System.Windows.Forms.Button button1;
    }
}