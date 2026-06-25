.class final LH/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LH/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/d;->b(LK0/j;)LH/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/j;


# direct methods
.method constructor <init>(LK0/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH/d$a;->a:LK0/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final o1(LI0/p;Lie/a;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p3, p0, LH/d$a;->a:LK0/j;

    .line 2
    .line 3
    invoke-static {p3}, LK0/l;->a(LK0/j;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-static {p1}, LI0/q;->e(LI0/p;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-interface {p2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lr0/h;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Lr0/h;->t(J)Lr0/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, LH/d;->a(Lr0/h;)Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-virtual {p3, p1, p2}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 36
    .line 37
    return-object p1
.end method
