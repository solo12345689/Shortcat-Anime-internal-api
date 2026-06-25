.class Lr/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/a$b;,
        Lr/a$c;,
        Lr/a$d;
    }
.end annotation


# instance fields
.field private a:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

.field private b:LC1/a$c;

.field final c:Lr/a$d;


# direct methods
.method constructor <init>(Lr/a$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/a;->c:Lr/a$d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method a()Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/a;->a:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr/a;->c:Lr/a$d;

    .line 6
    .line 7
    invoke-static {v0}, Lr/a$b;->a(Lr/a$d;)Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lr/a;->a:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lr/a;->a:Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 14
    .line 15
    return-object v0
.end method

.method b()LC1/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/a;->b:LC1/a$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr/a$a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lr/a$a;-><init>(Lr/a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr/a;->b:LC1/a$c;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr/a;->b:LC1/a$c;

    .line 13
    .line 14
    return-object v0
.end method
