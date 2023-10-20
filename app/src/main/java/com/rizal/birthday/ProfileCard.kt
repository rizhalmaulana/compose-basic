package com.rizal.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rizal.birthday.ui.theme.BirthdayTheme

class ProfileCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    CardLayout()
                }
            }
        }
    }
}

@Composable
fun CardLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFCEF5D1)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        ComponentCardProfile(
            fullName = stringResource(R.string.full_name),
            title = stringResource(R.string.title_profile)
        )
        ComponentCardSocial(
            phone = stringResource(R.string.phone_number),
            socialMedia = stringResource(R.string.social_media),
            email = stringResource(R.string.gmail)
        )
    }
}

@Composable
fun ComponentCardProfile(
    fullName: String,
    title: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(width = 120.dp, height = 100.dp)
                .background(Color(0xFF1D421F), shape = CircleShape)
                .clip(CircleShape)
        )
        Text(
            text = fullName,
            fontSize = 25.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0E9E4E)
        )
    }
}

@Composable
fun ComponentCardSocial(
    phone: String,
    socialMedia: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Phone Icon",
                modifier = modifier.size(20.dp, 20.dp),
                tint = Color(0xFF0E9E4E)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = phone,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
            )
        }
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Social Media Icon",
                modifier = modifier.size(20.dp, 20.dp),
                tint = Color(0xFF0E9E4E)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = socialMedia,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
            )
        }
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Icon(
                imageVector = Icons.Default.Mail,
                contentDescription = "Email Icon",
                modifier = modifier.size(20.dp, 20.dp),
                tint = Color(0xFF0E9E4E)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = email,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardLayoutPreview() {
    BirthdayTheme {
        CardLayout()
    }
}