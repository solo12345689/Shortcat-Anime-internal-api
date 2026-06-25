.class final Lcom/google/android/gms/internal/gtm/zzfe;
.super Lcom/google/android/gms/internal/gtm/zzbs;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final zza:[B


# instance fields
.field private final zzb:Ljava/lang/String;

.field private final zzc:Lcom/google/android/gms/internal/gtm/zzfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\n"

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/google/android/gms/internal/gtm/zzfe;->zza:[B

    .line 8
    .line 9
    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzbv;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzbs;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    .line 2
    .line 3
    .line 4
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzbt;->zza:Ljava/lang/String;

    .line 5
    .line 6
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/google/android/gms/internal/gtm/zzfs;->zzd(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v5, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, "GoogleAnalytics"

    .line 21
    .line 22
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "%s/%s (Linux; U; Android %s; %s; %s Build/%s)"

    .line 27
    .line 28
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfe;->zzb:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v0, Lcom/google/android/gms/internal/gtm/zzfo;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzr()Lcom/google/android/gms/common/util/d;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/gtm/zzfo;-><init>(Lcom/google/android/gms/common/util/d;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfe;->zzc:Lcom/google/android/gms/internal/gtm/zzfo;

    .line 44
    .line 45
    return-void
.end method

.method static bridge synthetic zzf()[B
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzfe;->zza:[B

    .line 2
    .line 3
    return-object v0
.end method

.method private final zzg(Ljava/net/URL;[B)I
    .locals 5

    .line 1
    const-string v0, "Error closing http post connection output stream"

    .line 2
    .line 3
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    array-length v1, p2

    .line 10
    const-string v2, "POST bytes, url"

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {p0, v2, v3, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzH(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzbr;->zzV()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    new-instance v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {v2, p2}, Ljava/lang/String;-><init>([B)V

    .line 28
    .line 29
    .line 30
    const-string v3, "Post payload\n"

    .line 31
    .line 32
    invoke-virtual {p0, v3, v2}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 v2, 0x0

    .line 36
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzo()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gtm/zzfe;->zzb(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    const/4 v3, 0x1

    .line 48
    :try_start_1
    invoke-virtual {p1, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2, p2}, Ljava/io/OutputStream;->write([B)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzfe;->zzk(Ljava/net/HttpURLConnection;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    const/16 v1, 0xc8

    .line 72
    .line 73
    if-ne p2, v1, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzs()Lcom/google/android/gms/internal/gtm/zzbq;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p2}, Lcom/google/android/gms/internal/gtm/zzbq;->zzi()V

    .line 80
    .line 81
    .line 82
    move p2, v1

    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception p2

    .line 85
    goto :goto_7

    .line 86
    :catch_0
    move-exception p2

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    :goto_0
    const-string v1, "POST status"

    .line 89
    .line 90
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {p0, v1, v3}, Lcom/google/android/gms/internal/gtm/zzbr;->zzG(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catch_1
    move-exception v1

    .line 102
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 106
    .line 107
    .line 108
    return p2

    .line 109
    :goto_2
    move-object v4, v2

    .line 110
    move-object v2, p1

    .line 111
    move-object p1, v4

    .line 112
    goto :goto_5

    .line 113
    :catchall_1
    move-exception p1

    .line 114
    move-object p2, p1

    .line 115
    goto :goto_3

    .line 116
    :catch_2
    move-exception p1

    .line 117
    move-object p2, p1

    .line 118
    goto :goto_4

    .line 119
    :goto_3
    move-object p1, v2

    .line 120
    goto :goto_7

    .line 121
    :goto_4
    move-object p1, v2

    .line 122
    :goto_5
    :try_start_3
    const-string v1, "Network POST connection error"

    .line 123
    .line 124
    invoke-virtual {p0, v1, p2}, Lcom/google/android/gms/internal/gtm/zzbr;->zzS(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 125
    .line 126
    .line 127
    if-eqz p1, :cond_2

    .line 128
    .line 129
    :try_start_4
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 130
    .line 131
    .line 132
    goto :goto_6

    .line 133
    :catch_3
    move-exception p1

    .line 134
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    :goto_6
    if-eqz v2, :cond_3

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 140
    .line 141
    .line 142
    :cond_3
    const/4 p1, 0x0

    .line 143
    return p1

    .line 144
    :catchall_2
    move-exception p2

    .line 145
    move-object v4, v2

    .line 146
    move-object v2, p1

    .line 147
    move-object p1, v4

    .line 148
    :goto_7
    if-eqz v2, :cond_4

    .line 149
    .line 150
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 151
    .line 152
    .line 153
    goto :goto_8

    .line 154
    :catch_4
    move-exception v1

    .line 155
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_4
    :goto_8
    if-eqz p1, :cond_5

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 161
    .line 162
    .line 163
    :cond_5
    throw p2
.end method

.method private final zzh()Ljava/net/URL;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzi()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzeu;->zzt:Lcom/google/android/gms/internal/gtm/zzet;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v0, v1

    .line 36
    :goto_0
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const-string v1, "Error trying to parse the hardcoded host url"

    .line 44
    .line 45
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    return-object v0
.end method

.method private final zzi(Lcom/google/android/gms/internal/gtm/zzex;)Ljava/net/URL;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzex;->zzh()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzi()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzj()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    move-object p1, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzk()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzj()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    new-instance v0, Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :catch_0
    move-exception p1

    .line 77
    const-string v0, "Error trying to parse the hardcoded host url"

    .line 78
    .line 79
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    return-object p1
.end method

.method private final zzj(Lcom/google/android/gms/internal/gtm/zzex;Ljava/lang/String;)Ljava/net/URL;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzex;->zzh()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, "?"

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzi()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzj()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    add-int/2addr v2, v3

    .line 40
    add-int/2addr v2, v4

    .line 41
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzk()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzj()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    new-instance v5, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    add-int/2addr v2, v3

    .line 92
    add-int/2addr v2, v4

    .line 93
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_0
    :try_start_0
    new-instance p2, Ljava/net/URL;

    .line 113
    .line 114
    invoke-direct {p2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    return-object p2

    .line 118
    :catch_0
    move-exception p1

    .line 119
    const-string p2, "Error trying to parse the hardcoded host url"

    .line 120
    .line 121
    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const/4 p1, 0x0

    .line 125
    return-object p1
.end method

.method private final zzk(Ljava/net/HttpURLConnection;)V
    .locals 3

    .line 1
    const-string v0, "Error closing http connection input stream"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    const/16 v1, 0x400

    .line 8
    .line 9
    :try_start_1
    new-array v1, v1, [B

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    if-gtz v2, :cond_0

    .line 16
    .line 17
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_0

    .line 28
    :catchall_1
    move-exception v1

    .line 29
    const/4 p1, 0x0

    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catch_1
    move-exception p1

    .line 37
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    throw v1
.end method

.method private static final zzl(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x26

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    :cond_0
    const-string v0, "UTF-8"

    .line 13
    .line 14
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const/16 p1, 0x3d

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-static {p2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method final zza(Lcom/google/android/gms/internal/gtm/zzex;Z)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzex;->zzg()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    const-string v3, "z"

    .line 26
    .line 27
    const-string v4, "qt"

    .line 28
    .line 29
    const-string v5, "ht"

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-nez v5, :cond_0

    .line 50
    .line 51
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_0

    .line 56
    .line 57
    const-string v4, "AppUID"

    .line 58
    .line 59
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_0

    .line 64
    .line 65
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_0

    .line 70
    .line 71
    const-string v3, "_gmsv"

    .line 72
    .line 73
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_0

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v0, v6, v2}, Lcom/google/android/gms/internal/gtm/zzfe;->zzl(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-exception p1

    .line 90
    goto :goto_2

    .line 91
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzex;->zzd()J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v0, v5, v1}, Lcom/google/android/gms/internal/gtm/zzfe;->zzl(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzC()Lcom/google/android/gms/common/util/d;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {v1}, Lcom/google/android/gms/common/util/d;->a()J

    .line 107
    .line 108
    .line 109
    move-result-wide v1

    .line 110
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzex;->zzd()J

    .line 111
    .line 112
    .line 113
    move-result-wide v5

    .line 114
    sub-long/2addr v1, v5

    .line 115
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v0, v4, v1}, Lcom/google/android/gms/internal/gtm/zzfe;->zzl(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 123
    .line 124
    .line 125
    if-eqz p2, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzex;->zzc()J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    const-wide/16 v4, 0x0

    .line 132
    .line 133
    cmp-long p2, v1, v4

    .line 134
    .line 135
    if-eqz p2, :cond_2

    .line 136
    .line 137
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    goto :goto_1

    .line 142
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzex;->zzb()J

    .line 143
    .line 144
    .line 145
    move-result-wide p1

    .line 146
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    :goto_1
    invoke-static {v0, v3, p1}, Lcom/google/android/gms/internal/gtm/zzfe;->zzl(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    .line 157
    return-object p1

    .line 158
    :goto_2
    const-string p2, "Failed to encode name or value"

    .line 159
    .line 160
    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    return-object p1
.end method

.method final zzb(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzeu;->zzE:Lcom/google/android/gms/internal/gtm/zzet;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 34
    .line 35
    .line 36
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzeu;->zzF:Lcom/google/android/gms/internal/gtm/zzet;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "User-Agent"

    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzfe;->zzb:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 67
    .line 68
    const-string v0, "Failed to obtain http connection"

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method

.method public final zzc(Ljava/util/List;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/gtm/zzex;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "Error closing http compressed post connection output stream"

    .line 4
    .line 5
    invoke-static {}, LF8/n;->d()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    .line 9
    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzct;->zza()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v4, 0x1

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, v1, Lcom/google/android/gms/internal/gtm/zzfe;->zzc:Lcom/google/android/gms/internal/gtm/zzfo;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 32
    .line 33
    .line 34
    sget-object v5, Lcom/google/android/gms/internal/gtm/zzeu;->zzC:Lcom/google/android/gms/internal/gtm/zzet;

    .line 35
    .line 36
    invoke-virtual {v5}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    int-to-long v5, v5

    .line 47
    const-wide/16 v7, 0x3e8

    .line 48
    .line 49
    mul-long/2addr v5, v7

    .line 50
    invoke-virtual {v0, v5, v6}, Lcom/google/android/gms/internal/gtm/zzfo;->zzc(J)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    :cond_0
    const/4 v0, 0x0

    .line 57
    :goto_0
    const/4 v5, 0x0

    .line 58
    goto :goto_3

    .line 59
    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 60
    .line 61
    .line 62
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzeu;->zzv:Lcom/google/android/gms/internal/gtm/zzet;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/String;

    .line 69
    .line 70
    const-string v5, "BATCH_BY_SESSION"

    .line 71
    .line 72
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    :goto_1
    move v0, v4

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const-string v5, "BATCH_BY_TIME"

    .line 81
    .line 82
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const-string v5, "BATCH_BY_BRUTE_FORCE"

    .line 90
    .line 91
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    const-string v5, "BATCH_BY_COUNT"

    .line 99
    .line 100
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_5

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    const-string v5, "BATCH_BY_SIZE"

    .line 108
    .line 109
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    const/4 v0, 0x0

    .line 117
    :goto_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 118
    .line 119
    .line 120
    sget-object v5, Lcom/google/android/gms/internal/gtm/zzeu;->zzw:Lcom/google/android/gms/internal/gtm/zzet;

    .line 121
    .line 122
    invoke-virtual {v5}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Ljava/lang/String;

    .line 127
    .line 128
    const-string v6, "GZIP"

    .line 129
    .line 130
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eq v4, v5, :cond_7

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_7
    move v5, v4

    .line 138
    :goto_3
    const/16 v6, 0xc8

    .line 139
    .line 140
    if-eqz v0, :cond_17

    .line 141
    .line 142
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    xor-int/2addr v0, v4

    .line 147
    invoke-static {v0}, LR8/p;->a(Z)V

    .line 148
    .line 149
    .line 150
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    const-string v9, "Uploading batched hits. compression, count"

    .line 163
    .line 164
    invoke-virtual {v1, v9, v0, v8}, Lcom/google/android/gms/internal/gtm/zzbr;->zzQ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    new-instance v8, Lcom/google/android/gms/internal/gtm/zzfd;

    .line 168
    .line 169
    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/gtm/zzfd;-><init>(Lcom/google/android/gms/internal/gtm/zzfe;)V

    .line 170
    .line 171
    .line 172
    new-instance v9, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-eqz v10, :cond_9

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    check-cast v10, Lcom/google/android/gms/internal/gtm/zzex;

    .line 192
    .line 193
    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/gtm/zzfd;->zzb(Lcom/google/android/gms/internal/gtm/zzex;)Z

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    if-nez v11, :cond_8

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_8
    invoke-virtual {v10}, Lcom/google/android/gms/internal/gtm/zzex;->zzb()J

    .line 201
    .line 202
    .line 203
    move-result-wide v10

    .line 204
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_9
    :goto_5
    invoke-virtual {v8}, Lcom/google/android/gms/internal/gtm/zzfd;->zza()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_a

    .line 217
    .line 218
    goto/16 :goto_16

    .line 219
    .line 220
    :cond_a
    invoke-direct {v1}, Lcom/google/android/gms/internal/gtm/zzfe;->zzh()Ljava/net/URL;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-nez v0, :cond_b

    .line 225
    .line 226
    const-string v0, "Failed to build batching endpoint url"

    .line 227
    .line 228
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzJ(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 232
    .line 233
    return-object v0

    .line 234
    :cond_b
    if-eqz v5, :cond_14

    .line 235
    .line 236
    invoke-virtual {v8}, Lcom/google/android/gms/internal/gtm/zzfd;->zzc()[B

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    invoke-static {v5}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzo()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 254
    .line 255
    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 256
    .line 257
    .line 258
    new-instance v11, Ljava/util/zip/GZIPOutputStream;

    .line 259
    .line 260
    invoke-direct {v11, v10}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v11, v5}, Ljava/io/OutputStream;->write([B)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    const-string v11, "POST compressed size, ratio %, url"

    .line 277
    .line 278
    array-length v12, v10

    .line 279
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v13

    .line 283
    int-to-long v14, v12

    .line 284
    const-wide/16 v16, 0x64

    .line 285
    .line 286
    mul-long v14, v14, v16

    .line 287
    .line 288
    array-length v7, v5

    .line 289
    int-to-long v3, v7

    .line 290
    div-long/2addr v14, v3

    .line 291
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v1, v11, v13, v3, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzI(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    if-le v12, v7, :cond_c

    .line 299
    .line 300
    const-string v3, "Compressed payload is larger then uncompressed. compressed, uncompressed"

    .line 301
    .line 302
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    invoke-virtual {v1, v3, v13, v4}, Lcom/google/android/gms/internal/gtm/zzbr;->zzT(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    goto :goto_6

    .line 310
    :catchall_0
    move-exception v0

    .line 311
    goto/16 :goto_f

    .line 312
    .line 313
    :catch_0
    move-exception v0

    .line 314
    goto/16 :goto_10

    .line 315
    .line 316
    :cond_c
    :goto_6
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzbr;->zzV()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_e

    .line 321
    .line 322
    const-string v3, "Post payload"

    .line 323
    .line 324
    const-string v4, "\n"

    .line 325
    .line 326
    new-instance v7, Ljava/lang/String;

    .line 327
    .line 328
    invoke-direct {v7, v5}, Ljava/lang/String;-><init>([B)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    if-eqz v5, :cond_d

    .line 336
    .line 337
    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    goto :goto_7

    .line 342
    :cond_d
    new-instance v5, Ljava/lang/String;

    .line 343
    .line 344
    invoke-direct {v5, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    move-object v4, v5

    .line 348
    :goto_7
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :cond_e
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzfe;->zzb(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    .line 352
    .line 353
    .line 354
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    const/4 v0, 0x1

    .line 356
    :try_start_1
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 357
    .line 358
    .line 359
    const-string v0, "Content-Encoding"

    .line 360
    .line 361
    const-string v4, "gzip"

    .line 362
    .line 363
    invoke-virtual {v3, v0, v4}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v3, v12}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 373
    .line 374
    .line 375
    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 376
    :try_start_2
    invoke-virtual {v4, v10}, Ljava/io/OutputStream;->write([B)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 380
    .line 381
    .line 382
    :try_start_3
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/gtm/zzfe;->zzk(Ljava/net/HttpURLConnection;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-ne v0, v6, :cond_f

    .line 390
    .line 391
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzs()Lcom/google/android/gms/internal/gtm/zzbq;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbq;->zzi()V

    .line 396
    .line 397
    .line 398
    move v0, v6

    .line 399
    goto :goto_8

    .line 400
    :catchall_1
    move-exception v0

    .line 401
    goto :goto_c

    .line 402
    :catch_1
    move-exception v0

    .line 403
    goto :goto_d

    .line 404
    :cond_f
    :goto_8
    const-string v4, "POST status"

    .line 405
    .line 406
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/gtm/zzbr;->zzG(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 411
    .line 412
    .line 413
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 414
    .line 415
    .line 416
    move v3, v0

    .line 417
    goto/16 :goto_15

    .line 418
    .line 419
    :catchall_2
    move-exception v0

    .line 420
    goto :goto_9

    .line 421
    :catch_2
    move-exception v0

    .line 422
    goto :goto_b

    .line 423
    :goto_9
    move-object/from16 v16, v3

    .line 424
    .line 425
    move-object v7, v4

    .line 426
    :goto_a
    move-object v3, v0

    .line 427
    goto :goto_13

    .line 428
    :goto_b
    move-object v7, v3

    .line 429
    move-object/from16 v16, v4

    .line 430
    .line 431
    goto :goto_11

    .line 432
    :goto_c
    move-object/from16 v16, v3

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    goto :goto_a

    .line 436
    :goto_d
    move-object v7, v3

    .line 437
    :goto_e
    const/16 v16, 0x0

    .line 438
    .line 439
    goto :goto_11

    .line 440
    :goto_f
    move-object v3, v0

    .line 441
    const/4 v7, 0x0

    .line 442
    const/16 v16, 0x0

    .line 443
    .line 444
    goto :goto_13

    .line 445
    :goto_10
    const/4 v7, 0x0

    .line 446
    goto :goto_e

    .line 447
    :goto_11
    :try_start_4
    const-string v3, "Network compressed POST connection error"

    .line 448
    .line 449
    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzS(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 450
    .line 451
    .line 452
    if-eqz v16, :cond_10

    .line 453
    .line 454
    :try_start_5
    invoke-virtual/range {v16 .. v16}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 455
    .line 456
    .line 457
    goto :goto_12

    .line 458
    :catch_3
    move-exception v0

    .line 459
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    :cond_10
    :goto_12
    if-eqz v7, :cond_11

    .line 463
    .line 464
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 465
    .line 466
    .line 467
    :cond_11
    const/4 v3, 0x0

    .line 468
    goto :goto_15

    .line 469
    :catchall_3
    move-exception v0

    .line 470
    move-object/from16 v3, v16

    .line 471
    .line 472
    move-object/from16 v16, v7

    .line 473
    .line 474
    move-object v7, v3

    .line 475
    goto :goto_a

    .line 476
    :goto_13
    if-eqz v7, :cond_12

    .line 477
    .line 478
    :try_start_6
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 479
    .line 480
    .line 481
    goto :goto_14

    .line 482
    :catch_4
    move-exception v0

    .line 483
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    :cond_12
    :goto_14
    if-eqz v16, :cond_13

    .line 487
    .line 488
    invoke-virtual/range {v16 .. v16}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 489
    .line 490
    .line 491
    :cond_13
    throw v3

    .line 492
    :cond_14
    invoke-virtual {v8}, Lcom/google/android/gms/internal/gtm/zzfd;->zzc()[B

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/gtm/zzfe;->zzg(Ljava/net/URL;[B)I

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    :goto_15
    if-ne v3, v6, :cond_15

    .line 501
    .line 502
    invoke-virtual {v8}, Lcom/google/android/gms/internal/gtm/zzfd;->zza()I

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    const-string v2, "Batched upload completed. Hits batched"

    .line 511
    .line 512
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    goto :goto_16

    .line 516
    :cond_15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    const-string v2, "Network error uploading hits. status code"

    .line 521
    .line 522
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    invoke-virtual {v2}, Lcom/google/android/gms/internal/gtm/zzct;->zza()Ljava/util/Set;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    if-eqz v0, :cond_16

    .line 538
    .line 539
    const-string v0, "Server instructed the client to stop batching"

    .line 540
    .line 541
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzR(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    iget-object v0, v1, Lcom/google/android/gms/internal/gtm/zzfe;->zzc:Lcom/google/android/gms/internal/gtm/zzfo;

    .line 545
    .line 546
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzfo;->zzb()V

    .line 547
    .line 548
    .line 549
    :cond_16
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 550
    .line 551
    :goto_16
    return-object v9

    .line 552
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    .line 553
    .line 554
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 559
    .line 560
    .line 561
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    if-eqz v3, :cond_21

    .line 570
    .line 571
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    check-cast v3, Lcom/google/android/gms/internal/gtm/zzex;

    .line 576
    .line 577
    invoke-static {v3}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v3}, Lcom/google/android/gms/internal/gtm/zzex;->zzh()Z

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    const/16 v18, 0x1

    .line 585
    .line 586
    xor-int/lit8 v4, v4, 0x1

    .line 587
    .line 588
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/gtm/zzfe;->zza(Lcom/google/android/gms/internal/gtm/zzex;Z)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v4

    .line 592
    if-nez v4, :cond_19

    .line 593
    .line 594
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzz()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    const-string v5, "Error formatting hit for upload"

    .line 599
    .line 600
    invoke-virtual {v4, v3, v5}, Lcom/google/android/gms/internal/gtm/zzfb;->zzb(Lcom/google/android/gms/internal/gtm/zzex;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    :goto_17
    const/4 v4, 0x0

    .line 604
    goto/16 :goto_1d

    .line 605
    .line 606
    :cond_19
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 607
    .line 608
    .line 609
    move-result v5

    .line 610
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 611
    .line 612
    .line 613
    sget-object v7, Lcom/google/android/gms/internal/gtm/zzeu;->zzu:Lcom/google/android/gms/internal/gtm/zzet;

    .line 614
    .line 615
    invoke-virtual {v7}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v7

    .line 619
    check-cast v7, Ljava/lang/Integer;

    .line 620
    .line 621
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result v7

    .line 625
    if-gt v5, v7, :cond_1d

    .line 626
    .line 627
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/gtm/zzfe;->zzj(Lcom/google/android/gms/internal/gtm/zzex;Ljava/lang/String;)Ljava/net/URL;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    if-nez v4, :cond_1a

    .line 632
    .line 633
    const-string v0, "Failed to build collect GET endpoint url"

    .line 634
    .line 635
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzJ(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    return-object v2

    .line 639
    :cond_1a
    invoke-static {v4}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    const-string v5, "GET request"

    .line 643
    .line 644
    invoke-virtual {v1, v5, v4}, Lcom/google/android/gms/internal/gtm/zzbr;->zzG(Ljava/lang/String;Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    :try_start_7
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/gtm/zzfe;->zzb(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    .line 648
    .line 649
    .line 650
    move-result-object v4
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 651
    :try_start_8
    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    .line 652
    .line 653
    .line 654
    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/gtm/zzfe;->zzk(Ljava/net/HttpURLConnection;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 658
    .line 659
    .line 660
    move-result v5

    .line 661
    if-ne v5, v6, :cond_1b

    .line 662
    .line 663
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzs()Lcom/google/android/gms/internal/gtm/zzbq;

    .line 664
    .line 665
    .line 666
    move-result-object v5

    .line 667
    invoke-virtual {v5}, Lcom/google/android/gms/internal/gtm/zzbq;->zzi()V

    .line 668
    .line 669
    .line 670
    move v5, v6

    .line 671
    goto :goto_18

    .line 672
    :catchall_4
    move-exception v0

    .line 673
    goto :goto_19

    .line 674
    :catch_5
    move-exception v0

    .line 675
    goto :goto_1a

    .line 676
    :cond_1b
    :goto_18
    const-string v7, "GET status"

    .line 677
    .line 678
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 679
    .line 680
    .line 681
    move-result-object v8

    .line 682
    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/gtm/zzbr;->zzG(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 683
    .line 684
    .line 685
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 686
    .line 687
    .line 688
    if-ne v5, v6, :cond_21

    .line 689
    .line 690
    goto :goto_17

    .line 691
    :goto_19
    move-object v7, v4

    .line 692
    goto :goto_1c

    .line 693
    :goto_1a
    move-object v7, v4

    .line 694
    goto :goto_1b

    .line 695
    :catchall_5
    move-exception v0

    .line 696
    const/4 v7, 0x0

    .line 697
    goto :goto_1c

    .line 698
    :catch_6
    move-exception v0

    .line 699
    const/4 v7, 0x0

    .line 700
    :goto_1b
    :try_start_9
    const-string v3, "Network GET connection error"

    .line 701
    .line 702
    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzS(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 703
    .line 704
    .line 705
    if-eqz v7, :cond_21

    .line 706
    .line 707
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 708
    .line 709
    .line 710
    goto :goto_1e

    .line 711
    :catchall_6
    move-exception v0

    .line 712
    :goto_1c
    if-eqz v7, :cond_1c

    .line 713
    .line 714
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 715
    .line 716
    .line 717
    :cond_1c
    throw v0

    .line 718
    :cond_1d
    const/4 v4, 0x0

    .line 719
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/gtm/zzfe;->zza(Lcom/google/android/gms/internal/gtm/zzex;Z)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    if-nez v5, :cond_1e

    .line 724
    .line 725
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzz()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 726
    .line 727
    .line 728
    move-result-object v5

    .line 729
    const-string v7, "Error formatting hit for POST upload"

    .line 730
    .line 731
    invoke-virtual {v5, v3, v7}, Lcom/google/android/gms/internal/gtm/zzfb;->zzb(Lcom/google/android/gms/internal/gtm/zzex;Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    goto :goto_1d

    .line 735
    :cond_1e
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    .line 736
    .line 737
    .line 738
    move-result-object v5

    .line 739
    array-length v7, v5

    .line 740
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 741
    .line 742
    .line 743
    sget-object v8, Lcom/google/android/gms/internal/gtm/zzeu;->zzz:Lcom/google/android/gms/internal/gtm/zzet;

    .line 744
    .line 745
    invoke-virtual {v8}, Lcom/google/android/gms/internal/gtm/zzet;->zzb()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    check-cast v8, Ljava/lang/Integer;

    .line 750
    .line 751
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 752
    .line 753
    .line 754
    move-result v8

    .line 755
    if-le v7, v8, :cond_1f

    .line 756
    .line 757
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzz()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 758
    .line 759
    .line 760
    move-result-object v5

    .line 761
    const-string v7, "Hit payload exceeds size limit"

    .line 762
    .line 763
    invoke-virtual {v5, v3, v7}, Lcom/google/android/gms/internal/gtm/zzfb;->zzb(Lcom/google/android/gms/internal/gtm/zzex;Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    goto :goto_1d

    .line 767
    :cond_1f
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/gtm/zzfe;->zzi(Lcom/google/android/gms/internal/gtm/zzex;)Ljava/net/URL;

    .line 768
    .line 769
    .line 770
    move-result-object v7

    .line 771
    if-nez v7, :cond_20

    .line 772
    .line 773
    const-string v0, "Failed to build collect POST endpoint url"

    .line 774
    .line 775
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzJ(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    return-object v2

    .line 779
    :cond_20
    invoke-direct {v1, v7, v5}, Lcom/google/android/gms/internal/gtm/zzfe;->zzg(Ljava/net/URL;[B)I

    .line 780
    .line 781
    .line 782
    move-result v5

    .line 783
    if-ne v5, v6, :cond_21

    .line 784
    .line 785
    :goto_1d
    invoke-virtual {v3}, Lcom/google/android/gms/internal/gtm/zzex;->zzb()J

    .line 786
    .line 787
    .line 788
    move-result-wide v7

    .line 789
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 797
    .line 798
    .line 799
    move-result v3

    .line 800
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzw()Lcom/google/android/gms/internal/gtm/zzct;

    .line 801
    .line 802
    .line 803
    invoke-static {}, Lcom/google/android/gms/internal/gtm/zzct;->zzh()I

    .line 804
    .line 805
    .line 806
    move-result v5

    .line 807
    if-lt v3, v5, :cond_18

    .line 808
    .line 809
    :cond_21
    :goto_1e
    return-object v2
.end method

.method protected final zzd()V
    .locals 2

    .line 1
    const-string v0, "Network initialized. User agent"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzfe;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zze()Z
    .locals 2

    .line 1
    invoke-static {}, LF8/n;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzo()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "connectivity"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 v0, 0x1

    .line 35
    return v0

    .line 36
    :cond_1
    :goto_1
    const-string v0, "No network connectivity"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzO(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    return v0
.end method
