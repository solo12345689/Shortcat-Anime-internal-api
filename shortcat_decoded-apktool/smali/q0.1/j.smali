.class public interface abstract Lq0/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq0/h;


# direct methods
.method public static synthetic c(Lq0/j;Landroid/view/KeyEvent;Lie/a;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p2, Lq0/j$a;->a:Lq0/j$a;

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0, p1, p2}, Lq0/j;->d(Landroid/view/KeyEvent;Lie/a;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b(Landroidx/compose/ui/focus/d;Lr0/h;)Z
.end method

.method public abstract d(Landroid/view/KeyEvent;Lie/a;)Z
.end method

.method public abstract e(ILr0/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
.end method

.method public abstract f(LG0/b;Lie/a;)Z
.end method

.method public abstract g(LB0/c;Lie/a;)Z
.end method

.method public abstract i(Landroid/view/KeyEvent;)Z
.end method

.method public abstract j()Landroidx/compose/ui/focus/FocusTargetNode;
.end method

.method public abstract k(Landroidx/compose/ui/focus/FocusTargetNode;)V
.end method

.method public abstract l()V
.end method

.method public abstract m()Landroidx/compose/ui/e;
.end method

.method public abstract n(Lq0/d;)V
.end method

.method public abstract o()Z
.end method

.method public abstract p(ZZZI)Z
.end method

.method public abstract q()Lq0/n;
.end method

.method public abstract r()Lr0/h;
.end method

.method public abstract s(Landroidx/compose/ui/focus/FocusTargetNode;)V
.end method

.method public abstract t()V
.end method

.method public abstract u()Lt/L;
.end method
