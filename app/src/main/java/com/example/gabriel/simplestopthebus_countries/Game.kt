package com.example.gabriel.simplestopthebus_countries

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class Game : AppCompatActivity() {

    var randomNum = 0
    var randomLetter = 0
    var letter = ""
    val listOfAnswersUser = arrayOfNulls<String>(28)

    val countriesA = arrayOf<String>("Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan")
    val countriesB = arrayOf<String>("Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burma", "Burundi")
    val countriesC = arrayOf<String>("Cambodia", "Cameroon", "Canada", "Cabo Verde", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Curacao", "Cyprus", "Czechia")
    val countriesD = arrayOf<String>("Denmark", "Djibouti", "Dominica", "Dominican Republic")
    val countriesE = arrayOf<String>("East Timor (see Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia")
    val countriesF = arrayOf<String>("Fiji", "Finland", "France")
    val countriesG = arrayOf<String>("Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana")
    val countriesH = arrayOf<String>("Haiti", "Holy See", "Honduras", "Hong Kong", "Hungary")
    val countriesI = arrayOf<String>("Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy")
    val countriesJ = arrayOf<String>("Jamaica", "Japan", "Jordan")
    val countriesK = arrayOf<String>("Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan")
    val countriesL = arrayOf<String>("Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg")
    val countriesM = arrayOf<String>("Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique")
    val countriesN = arrayOf<String>("Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "Norway")
    val countriesO = arrayOf<String>("Oman")
    val countriesP = arrayOf<String>("Pakistan", "Palau", "Palestinian Territories", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal")
    val countriesQ = arrayOf<String>("Qatar")
    val countriesR = arrayOf<String>("Romania", "Russia", "Rwanda")
    val countriesS = arrayOf<String>("Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Maarten", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria")
    val countriesT = arrayOf<String>("Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu")
    val countriesU = arrayOf<String>("Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "Uruguay", "Uzbekistan")
    val countriesV = arrayOf<String>("Vanuatu", "Venezuela", "Vietnam")
    val countriesY = arrayOf<String>("Yemen")
    val countriesZ = arrayOf<String>("Zambia", "Zimbabwe")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        RandomNumberGeneratorforLetter()
        chooseLetter()
        clickListenerSubmit()
    }


    //this function chooses the letter to start the game
    fun chooseLetter() {

        RandomNumberGeneratorforLetter()
        val listOfLetters = arrayOf<String>("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")

        var i = 0


        do {

            if (i == randomNum) {
                letter = listOfLetters[i]

            } else {
                i++
            }
        } while (i <= randomNum)
        lblLetter.setText(letter)
    }


    //this function chooses the pc's answers
    fun chooseAnswer(array: Array<String>) {

        val listOfAnswers = arrayOfNulls<String>((array.size) / 2)
        var i = 0

        RandomNumberGeneratorforAnswer()

        for (i in 0..28) {
            listOfAnswers[i] = array[randomLetter]
            array[randomLetter] = ""
            lblAnswer.text
        }
        val stringOfAnswers = Arrays.toString(listOfAnswers)
        lblPCAnswers.setText(stringOfAnswers)
        i++
    }


    // this function generates a random number to be used in the letter choosing
    fun RandomNumberGeneratorforLetter() {
        var random = Random()
        var min = 0
        var max = 25
        randomNum = random.nextInt(max + 1 - min) + min
    }


    //this function generates a random number to be used in th answer choosing
    fun RandomNumberGeneratorforAnswer() {
        var randomAnswer = Random()
        var min = 0
        var max = 27
        randomLetter = randomAnswer.nextInt(max + 1 - min) + min
    }

    fun clickListenerSubmit() {
        var x = 0
        btnSubmit.setOnClickListener {
            for (x in 0..28) {
                listOfAnswersUser[x] = lblAnswer.getText().toString()
                when (randomNum) {
                    0 -> chooseAnswer(countriesA)
                    1 -> chooseAnswer(countriesB)
                    2 -> chooseAnswer(countriesC)
                    3 -> chooseAnswer(countriesD)
                    4 -> chooseAnswer(countriesE)
                    5 -> chooseAnswer(countriesF)
                    6 -> chooseAnswer(countriesG)
                    7 -> chooseAnswer(countriesH)
                    8 -> chooseAnswer(countriesI)
                    9 -> chooseAnswer(countriesJ)
                    10 -> chooseAnswer(countriesK)
                    11 -> chooseAnswer(countriesL)
                    12 -> chooseAnswer(countriesM)
                    13 -> chooseAnswer(countriesN)
                    14 -> chooseAnswer(countriesO)
                    15 -> chooseAnswer(countriesP)
                    16 -> chooseAnswer(countriesQ)
                    17 -> chooseAnswer(countriesR)
                    18 -> chooseAnswer(countriesS)
                    19 -> chooseAnswer(countriesT)
                    20 -> chooseAnswer(countriesU)
                    21 -> chooseAnswer(countriesV)
                    24 -> chooseAnswer(countriesY)
                    25 -> chooseAnswer(countriesZ)
                }
            }
            val stringOfUserAnswers = Arrays.toString(listOfAnswersUser)
            lblUserAnswers.setText(stringOfUserAnswers)
            ++x
        }
    }
}