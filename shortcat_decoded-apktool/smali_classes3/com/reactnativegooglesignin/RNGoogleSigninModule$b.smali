.class Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;
.super Lcom/facebook/react/bridge/BaseActivityEventListener;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativegooglesignin/RNGoogleSigninModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/reactnativegooglesignin/RNGoogleSigninModule;


# direct methods
.method private constructor <init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;->a:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    invoke-direct {p0}, Lcom/facebook/react/bridge/BaseActivityEventListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Lcom/reactnativegooglesignin/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    return-void
.end method


# virtual methods
.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    .line 1
    const/16 p1, 0x2329

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-static {p4}, Lcom/google/android/gms/auth/api/signin/a;->c(Landroid/content/Intent;)Ln9/i;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;->a:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    .line 10
    .line 11
    invoke-static {p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->f(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/reactnativegooglesignin/c;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {p2, p1, p3}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->i(Lcom/reactnativegooglesignin/RNGoogleSigninModule;Ln9/i;Lcom/reactnativegooglesignin/c;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const p1, 0xd02e

    .line 20
    .line 21
    .line 22
    const/4 p4, -0x1

    .line 23
    if-ne p2, p1, :cond_2

    .line 24
    .line 25
    if-ne p3, p4, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;->a:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->j(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;->a:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->g(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/reactnativegooglesignin/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "Failed authentication recovery attempt, probably user-rejected."

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lcom/reactnativegooglesignin/c;->c(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    const p1, 0xd02f

    .line 46
    .line 47
    .line 48
    if-ne p2, p1, :cond_4

    .line 49
    .line 50
    if-ne p3, p4, :cond_3

    .line 51
    .line 52
    iget-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;->a:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->f(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/reactnativegooglesignin/c;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lcom/reactnativegooglesignin/c;->g(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    iget-object p1, p0, Lcom/reactnativegooglesignin/RNGoogleSigninModule$b;->a:Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    .line 65
    .line 66
    invoke-static {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;->f(Lcom/reactnativegooglesignin/RNGoogleSigninModule;)Lcom/reactnativegooglesignin/c;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string p2, "Failed to add scopes."

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lcom/reactnativegooglesignin/c;->c(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    return-void
.end method
