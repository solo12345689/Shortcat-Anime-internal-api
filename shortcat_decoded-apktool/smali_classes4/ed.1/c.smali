.class public final Led/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroidx/fragment/app/v;

.field private b:Ljava/util/concurrent/Executor;

.field private c:Lr/f$d;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/v;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "currentActivity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "title"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Led/c;->a:Landroidx/fragment/app/v;

    .line 20
    .line 21
    invoke-static {p2}, Ly1/b;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "getMainExecutor(...)"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Led/c;->b:Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    new-instance p1, Lr/f$d$a;

    .line 33
    .line 34
    invoke-direct {p1}, Lr/f$d$a;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p3}, Lr/f$d$a;->c(Ljava/lang/CharSequence;)Lr/f$d$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/high16 p3, 0x1040000

    .line 42
    .line 43
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, p2}, Lr/f$d$a;->b(Ljava/lang/CharSequence;)Lr/f$d$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lr/f$d$a;->a()Lr/f$d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string p2, "build(...)"

    .line 56
    .line 57
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Led/c;->c:Lr/f$d;

    .line 61
    .line 62
    return-void
.end method

.method public static final synthetic a(Led/c;I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Led/c;->c(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c(I)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "User canceled the authentication"

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Unknown error (code: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, ")"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_1
    const-string p1, "No device credential"

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_2
    return-object v0

    .line 33
    :pswitch_3
    const-string p1, "Hardware not present"

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_4
    const-string p1, "No biometrics enrolled"

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_5
    return-object v0

    .line 40
    :pswitch_6
    const-string p1, "Lockout permanent"

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_7
    const-string p1, "Vendor error"

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_8
    const-string p1, "Lockout"

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_9
    const-string p1, "No space"

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_a
    const-string p1, "Timeout"

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_b
    const-string p1, "Unable to process"

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_c
    const-string p1, "Hardware unavailable"

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final b(Ljavax/crypto/Cipher;LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, LZd/k;

    .line 2
    .line 3
    invoke-static {p2}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lr/f;

    .line 11
    .line 12
    iget-object v2, p0, Led/c;->a:Landroidx/fragment/app/v;

    .line 13
    .line 14
    iget-object v3, p0, Led/c;->b:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    new-instance v4, Led/c$a;

    .line 17
    .line 18
    invoke-direct {v4, p0, v0}, Led/c$a;-><init>(Led/c;LZd/e;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3, v4}, Lr/f;-><init>(Landroidx/fragment/app/v;Ljava/util/concurrent/Executor;Lr/f$a;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Led/c;->c:Lr/f$d;

    .line 25
    .line 26
    new-instance v3, Lr/f$c;

    .line 27
    .line 28
    invoke-direct {v3, p1}, Lr/f$c;-><init>(Ljavax/crypto/Cipher;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2, v3}, Lr/f;->a(Lr/f$d;Lr/f$c;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object p1
.end method
