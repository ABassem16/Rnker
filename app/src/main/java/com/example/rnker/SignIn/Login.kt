package com.example.rnker.SignIn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.rnker.R
import com.google.firebase.auth.FirebaseAuth
import org.w3c.dom.Text

class Login : Fragment() {
    private lateinit var registerButton:Button
    private lateinit var email:TextView
    private lateinit var password:TextView
    lateinit var firebaseAuth:FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //ViewModel to validate credentials
        val loginViewModel=LoginViewModel()

        //firebase authentication instance
        firebaseAuth=FirebaseAuth.getInstance()
        //registerButton.setOnClickListener { view?.findNavController()?.navigate(R.id.action_login2_to_signUpFragment) }
        //layout values
//        registerButton.findViewById<Button>(R.id.register)
//        email.findViewById<TextView>(R.id.email)
//        password.findViewById<TextView>(R.id.password)
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}