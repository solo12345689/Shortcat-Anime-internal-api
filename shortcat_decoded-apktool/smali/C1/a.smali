.class public LC1/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC1/a$b;,
        LC1/a$e;,
        LC1/a$c;,
        LC1/a$d;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC1/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method

.method public static c(Landroid/content/Context;)LC1/a;
    .locals 1

    .line 1
    new-instance v0, LC1/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LC1/a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static d(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;
    .locals 0

    .line 1
    invoke-static {p0}, LC1/a$b;->c(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static g(Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;)LC1/a$e;
    .locals 0

    .line 1
    invoke-static {p0}, LC1/a$b;->f(Ljava/lang/Object;)LC1/a$e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static h(LC1/a$c;)Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;
    .locals 1

    .line 1
    new-instance v0, LC1/a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LC1/a$a;-><init>(LC1/a$c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static i(LC1/a$e;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;
    .locals 0

    .line 1
    invoke-static {p0}, LC1/a$b;->g(LC1/a$e;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a(LC1/a$e;ILG1/d;LC1/a$c;Landroid/os/Handler;)V
    .locals 6

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, LG1/d;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    check-cast p3, Landroid/os/CancellationSignal;

    .line 8
    .line 9
    :goto_0
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    move v2, p2

    .line 12
    move-object v3, p3

    .line 13
    move-object v4, p4

    .line 14
    move-object v5, p5

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 p3, 0x0

    .line 17
    goto :goto_0

    .line 18
    :goto_1
    invoke-virtual/range {v0 .. v5}, LC1/a;->b(LC1/a$e;ILandroid/os/CancellationSignal;LC1/a$c;Landroid/os/Handler;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public b(LC1/a$e;ILandroid/os/CancellationSignal;LC1/a$c;Landroid/os/Handler;)V
    .locals 7

    .line 1
    iget-object v0, p0, LC1/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LC1/a;->d(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, LC1/a;->i(LC1/a$e;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p4}, LC1/a;->h(LC1/a$c;)Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    move v4, p2

    .line 18
    move-object v3, p3

    .line 19
    move-object v6, p5

    .line 20
    invoke-static/range {v1 .. v6}, LC1/a$b;->a(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/CancellationSignal;ILjava/lang/Object;Landroid/os/Handler;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC1/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LC1/a;->d(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, LC1/a$b;->d(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC1/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LC1/a;->d(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, LC1/a$b;->e(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method
