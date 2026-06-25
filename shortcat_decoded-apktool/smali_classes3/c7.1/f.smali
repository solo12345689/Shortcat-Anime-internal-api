.class public interface abstract Lc7/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/JSExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc7/f$a;
    }
.end annotation


# direct methods
.method public static synthetic G(Lc7/f;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1}, Lc7/f;->v(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: openDebugger"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method


# virtual methods
.method public abstract A(Lcom/facebook/react/bridge/ReactContext;)V
.end method

.method public abstract B()V
.end method

.method public C()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public abstract D()Lr7/a;
.end method

.method public abstract E()Z
.end method

.method public abstract F()V
.end method

.method public abstract H(Lcom/facebook/react/bridge/ReactContext;)V
.end method

.method public abstract a()Landroid/app/Activity;
.end method

.method public abstract b(Ljava/lang/String;)Landroid/view/View;
.end method

.method public abstract c(Z)V
.end method

.method public abstract d(Ljava/lang/String;)LU6/g;
.end method

.method public abstract e(Landroid/view/View;)V
.end method

.method public abstract f()V
.end method

.method public abstract g()V
.end method

.method public abstract getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;
.end method

.method public abstract h(Ljava/lang/String;Lc7/f$a;)V
.end method

.method public abstract i(Z)V
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()Ljava/lang/String;
.end method

.method public abstract l()V
.end method

.method public abstract m()Z
.end method

.method public abstract n(Lc7/h;)V
.end method

.method public abstract o()Z
.end method

.method public abstract p()V
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract r(Landroid/util/Pair;)Landroid/util/Pair;
.end method

.method public abstract s(Z)V
.end method

.method public abstract t()Lc7/g;
.end method

.method public abstract u()Ljava/lang/String;
.end method

.method public abstract v(Ljava/lang/String;)V
.end method

.method public abstract w(Ljava/lang/String;Lc7/e;)V
.end method

.method public abstract x()Lc7/j;
.end method

.method public abstract y()V
.end method

.method public abstract z()[Lc7/k;
.end method
