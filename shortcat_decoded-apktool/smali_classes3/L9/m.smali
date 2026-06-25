.class public final LL9/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final c:LM9/i;


# instance fields
.field a:LM9/t;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LM9/i;

    .line 2
    .line 3
    const-string v1, "ReviewService"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LM9/i;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LL9/m;->c:LM9/i;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LL9/m;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1}, LM9/w;->a(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Landroid/content/Intent;

    .line 17
    .line 18
    const-string v1, "com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v1, "com.android.vending"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    new-instance v2, LM9/t;

    .line 30
    .line 31
    sget-object v4, LL9/m;->c:LM9/i;

    .line 32
    .line 33
    sget-object v7, LL9/i;->a:LL9/i;

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    const-string v5, "com.google.android.finsky.inappreviewservice.InAppReviewService"

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    invoke-direct/range {v2 .. v9}, LM9/t;-><init>(Landroid/content/Context;LM9/i;Ljava/lang/String;Landroid/content/Intent;LL9/i;LM9/o;[B)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, LL9/m;->a:LM9/t;

    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method static bridge synthetic b()LM9/i;
    .locals 1

    .line 1
    sget-object v0, LL9/m;->c:LM9/i;

    .line 2
    .line 3
    return-object v0
.end method

.method static bridge synthetic c(LL9/m;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LL9/m;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a()Ln9/i;
    .locals 3

    .line 1
    sget-object v0, LL9/m;->c:LM9/i;

    .line 2
    .line 3
    iget-object v1, p0, LL9/m;->b:Ljava/lang/String;

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "requestInAppReview (%s)"

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, LM9/i;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LL9/m;->a:LM9/t;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    new-array v1, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    const-string v2, "Play Store app is either not installed or not the official version"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, LM9/i;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    new-instance v0, LL9/a;

    .line 27
    .line 28
    const/4 v1, -0x1

    .line 29
    invoke-direct {v0, v1}, LL9/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ln9/l;->e(Ljava/lang/Exception;)Ln9/i;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v0, Ln9/j;

    .line 38
    .line 39
    invoke-direct {v0}, Ln9/j;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, LL9/m;->a:LM9/t;

    .line 43
    .line 44
    new-instance v2, LL9/j;

    .line 45
    .line 46
    invoke-direct {v2, p0, v0, v0}, LL9/j;-><init>(LL9/m;Ln9/j;Ln9/j;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2, v0}, LM9/t;->p(LM9/j;Ln9/j;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ln9/j;->a()Ln9/i;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method
