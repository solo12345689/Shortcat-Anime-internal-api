.class public final Led/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Led/b$a;
    }
.end annotation


# static fields
.field public static final d:Led/b$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lpb/b;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Led/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Led/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Led/b;->d:Led/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpb/b;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "moduleRegistry"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Led/b;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Led/b;->b:Lpb/b;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic a(Led/b;Ljavax/crypto/Cipher;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Led/b;->e(Ljavax/crypto/Cipher;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final d()Landroid/app/Activity;
    .locals 2

    .line 1
    iget-object v0, p0, Led/b;->b:Lpb/b;

    .line 2
    .line 3
    const-class v1, Lsb/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lpb/b;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getModule(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Lsb/a;

    .line 15
    .line 16
    invoke-interface {v0}, Lsb/a;->a()Landroid/app/Activity;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method private final e(Ljavax/crypto/Cipher;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Led/b$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Led/b$c;

    .line 7
    .line 8
    iget v1, v0, Led/b$c;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Led/b$c;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Led/b$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Led/b$c;-><init>(Led/b;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Led/b$c;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Led/b$c;->c:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-boolean p3, p0, Led/b;->c:Z

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    const/4 v5, 0x0

    .line 60
    if-nez p3, :cond_6

    .line 61
    .line 62
    iput-boolean v4, p0, Led/b;->c:Z

    .line 63
    .line 64
    :try_start_1
    invoke-virtual {p0}, Led/b;->b()V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Led/b;->d()Landroid/app/Activity;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    instance-of v6, p3, Landroidx/fragment/app/v;

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    check-cast p3, Landroidx/fragment/app/v;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move-object p3, v5

    .line 79
    :goto_1
    if-eqz p3, :cond_5

    .line 80
    .line 81
    new-instance v2, Led/c;

    .line 82
    .line 83
    iget-object v6, p0, Led/b;->a:Landroid/content/Context;

    .line 84
    .line 85
    invoke-direct {v2, p3, v6, p2}, Led/c;-><init>(Landroidx/fragment/app/v;Landroid/content/Context;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p2}, LGf/M0;->b2()LGf/M0;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    new-instance p3, Led/b$d;

    .line 97
    .line 98
    invoke-direct {p3, v2, p1, v5}, Led/b$d;-><init>(Led/c;Ljavax/crypto/Cipher;LZd/e;)V

    .line 99
    .line 100
    .line 101
    iput v4, v0, Led/b$c;->c:I

    .line 102
    .line 103
    invoke-static {p2, p3, v0}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    if-ne p3, v1, :cond_4

    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_4
    :goto_2
    iput-boolean v3, p0, Led/b;->c:Z

    .line 111
    .line 112
    return-object p3

    .line 113
    :cond_5
    :try_start_2
    new-instance p1, Led/a;

    .line 114
    .line 115
    const-string p2, "Cannot display biometric prompt when the app is not in the foreground"

    .line 116
    .line 117
    invoke-direct {p1, p2, v5, v2, v5}, Led/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 118
    .line 119
    .line 120
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    :goto_3
    iput-boolean v3, p0, Led/b;->c:Z

    .line 122
    .line 123
    throw p1

    .line 124
    :cond_6
    new-instance p1, Led/a;

    .line 125
    .line 126
    const-string p2, "Authentication is already in progress"

    .line 127
    .line 128
    invoke-direct {p1, p2, v5, v2, v5}, Led/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    .line 130
    .line 131
    throw p1
.end method


# virtual methods
.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Led/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lr/e;->g(Landroid/content/Context;)Lr/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "from(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xf

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lr/e;->a(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, -0x2

    .line 19
    const/4 v3, 0x2

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eq v0, v2, :cond_4

    .line 22
    .line 23
    const/4 v2, -0x1

    .line 24
    if-eq v0, v2, :cond_3

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    if-eq v0, v1, :cond_1

    .line 30
    .line 31
    const/16 v1, 0xb

    .line 32
    .line 33
    if-eq v0, v1, :cond_0

    .line 34
    .line 35
    const/16 v1, 0xc

    .line 36
    .line 37
    if-eq v0, v1, :cond_2

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    new-instance v0, Led/a;

    .line 41
    .line 42
    const-string v1, "No biometrics are currently enrolled"

    .line 43
    .line 44
    invoke-direct {v0, v1, v4, v3, v4}, Led/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_1
    new-instance v0, Led/a;

    .line 49
    .line 50
    const-string v1, "An update is required before the biometrics can be used"

    .line 51
    .line 52
    invoke-direct {v0, v1, v4, v3, v4}, Led/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_2
    new-instance v0, Led/a;

    .line 57
    .line 58
    const-string v1, "No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it"

    .line 59
    .line 60
    invoke-direct {v0, v1, v4, v3, v4}, Led/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_3
    new-instance v0, Led/a;

    .line 65
    .line 66
    const-string v1, "Biometric authentication status is unknown"

    .line 67
    .line 68
    invoke-direct {v0, v1, v4, v3, v4}, Led/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_4
    new-instance v0, Led/a;

    .line 73
    .line 74
    const-string v1, "Biometric authentication is unsupported"

    .line 75
    .line 76
    invoke-direct {v0, v1, v4, v3, v4}, Led/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    .line 78
    .line 79
    throw v0
.end method

.method public final c(Ljavax/crypto/Cipher;ZLjava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Led/b$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Led/b$b;

    .line 7
    .line 8
    iget v1, v0, Led/b$b;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Led/b$b;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Led/b$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Led/b$b;-><init>(Led/b;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Led/b$b;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Led/b$b;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    if-eqz p2, :cond_5

    .line 54
    .line 55
    iput v3, v0, Led/b$b;->c:I

    .line 56
    .line 57
    invoke-direct {p0, p1, p3, v0}, Led/b;->e(Ljavax/crypto/Cipher;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    if-ne p4, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    check-cast p4, Lr/f$b;

    .line 65
    .line 66
    invoke-virtual {p4}, Lr/f$b;->b()Lr/f$c;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1}, Lr/f$c;->a()Ljavax/crypto/Cipher;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_4
    new-instance p1, Led/a;

    .line 80
    .line 81
    const-string p2, "Couldn\'t get cipher from authentication result"

    .line 82
    .line 83
    const/4 p3, 0x2

    .line 84
    const/4 p4, 0x0

    .line 85
    invoke-direct {p1, p2, p4, p3, p4}, Led/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_5
    return-object p1
.end method
