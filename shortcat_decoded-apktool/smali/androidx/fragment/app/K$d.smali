.class Landroidx/fragment/app/K$d;
.super Landroidx/fragment/app/z;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/fragment/app/K;


# direct methods
.method constructor <init>(Landroidx/fragment/app/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/K$d;->b:Landroidx/fragment/app/K;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/fragment/app/z;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/q;
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/K$d;->b:Landroidx/fragment/app/K;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/K;->D0()Landroidx/fragment/app/A;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Landroidx/fragment/app/K$d;->b:Landroidx/fragment/app/K;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/K;->D0()Landroidx/fragment/app/A;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/A;->f()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p1, v0, p2, v1}, Landroidx/fragment/app/x;->b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/q;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
