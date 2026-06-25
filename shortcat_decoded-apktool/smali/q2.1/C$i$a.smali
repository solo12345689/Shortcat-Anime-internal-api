.class public final Lq2/C$i$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/C$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Ljava/lang/String;

.field private c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic a(Lq2/C$i$a;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$i$a;->a:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(Lq2/C$i$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$i$a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(Lq2/C$i$a;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/C$i$a;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public d()Lq2/C$i;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/C$i;-><init>(Lq2/C$i$a;Lq2/C$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public e(Landroid/os/Bundle;)Lq2/C$i$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$i$a;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Landroid/net/Uri;)Lq2/C$i$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$i$a;->a:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(Ljava/lang/String;)Lq2/C$i$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/C$i$a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
