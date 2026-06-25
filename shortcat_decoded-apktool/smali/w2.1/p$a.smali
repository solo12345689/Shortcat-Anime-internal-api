.class public final Lw2/p$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw2/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lw2/g$a;

.field private c:Lw2/F;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Lw2/q$b;

    invoke-direct {v0}, Lw2/q$b;-><init>()V

    invoke-direct {p0, p1, v0}, Lw2/p$a;-><init>(Landroid/content/Context;Lw2/g$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw2/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lw2/p$a;->a:Landroid/content/Context;

    .line 4
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw2/g$a;

    iput-object p1, p0, Lw2/p$a;->b:Lw2/g$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lw2/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw2/p$a;->b()Lw2/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Lw2/p;
    .locals 3

    .line 1
    new-instance v0, Lw2/p;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/p$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lw2/p$a;->b:Lw2/g$a;

    .line 6
    .line 7
    invoke-interface {v2}, Lw2/g$a;->a()Lw2/g;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Lw2/p;-><init>(Landroid/content/Context;Lw2/g;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lw2/p$a;->c:Lw2/F;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lw2/p;->i(Lw2/F;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
.end method
