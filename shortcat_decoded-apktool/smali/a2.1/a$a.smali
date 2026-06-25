.class La2/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LL1/E;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La2/a;


# direct methods
.method constructor <init>(La2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, La2/a$a;->a:La2/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LL1/E$a;)Z
    .locals 1

    .line 1
    iget-object p2, p0, La2/a$a;->a:La2/a;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, La2/a;->C(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, La2/a$a;->a:La2/a;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, La2/a;->r(Landroid/view/View;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v0, 0x2

    .line 16
    if-eq p2, v0, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, La2/a$a;->a:La2/a;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, La2/a;->f(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method
