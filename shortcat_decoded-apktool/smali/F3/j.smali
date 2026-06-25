.class public final LF3/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/j$d;,
        LF3/j$b;,
        LF3/j$c;,
        LF3/j$f;,
        LF3/j$e;,
        LF3/j$a;,
        LF3/j$j;,
        LF3/j$i;,
        LF3/j$h;,
        LF3/j$g;
    }
.end annotation


# instance fields
.field private final a:LF3/j$b;

.field private final b:LF3/n$j;

.field private final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;LF3/n$j;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LF3/j;->c:Ljava/util/Set;

    .line 4
    iput-object p2, p0, LF3/j;->b:LF3/n$j;

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 6
    new-instance v0, LF3/j$d;

    invoke-direct {v0, p1, p2}, LF3/j$d;-><init>(Landroid/content/Context;LF3/n$j;)V

    iput-object v0, p0, LF3/j;->a:LF3/j$b;

    return-void

    .line 7
    :cond_0
    new-instance v0, LF3/j$c;

    invoke-direct {v0, p1, p2}, LF3/j$c;-><init>(Landroid/content/Context;LF3/n$j;)V

    iput-object v0, p0, LF3/j;->a:LF3/j$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LF3/n;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, LF3/n;->e()LF3/n$j;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LF3/j;-><init>(Landroid/content/Context;LF3/n$j;)V

    return-void
.end method

.method static x(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "android.support.v4.media.session.action.FOLLOW"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "android.support.v4.media.session.action.UNFOLLOW"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const-string v0, "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, "."

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method


# virtual methods
.method public a(LF3/l;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LF3/j$b;->f(LF3/l;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(II)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LF3/j$b;->g(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LF3/j$b;->h(Landroid/view/KeyEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "KeyEvent may not be null"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public d()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->w()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->k()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()LF3/m;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->getMetadata()LF3/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->r()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()LF3/j$e;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->a()LF3/j$e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j()LF3/v;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->p()LF3/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->G()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->E()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->y()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->x()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->A()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public p()LF3/j$f;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->e()LF3/j$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->B()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/j$b;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public s(LF3/j$a;Landroid/os/Handler;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->c:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p1, "MediaControllerCompat"

    .line 10
    .line 11
    const-string p2, "the callback has already been registered"

    .line 12
    .line 13
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    new-instance p2, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p1, p2}, LF3/j$a;->n(Landroid/os/Handler;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 28
    .line 29
    invoke-interface {v0, p1, p2}, LF3/j$b;->b(LF3/j$a;Landroid/os/Handler;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public t(LF3/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/j$b;->H(LF3/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public u(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, LF3/j$b;->d(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    const-string p2, "command must neither be null nor empty"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public v(II)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j;->a:LF3/j$b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LF3/j$b;->i(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public w(LF3/j$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/j;->c:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p1, "MediaControllerCompat"

    .line 10
    .line 11
    const-string v0, "the callback has never been registered"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :try_start_0
    iget-object v1, p0, LF3/j;->a:LF3/j$b;

    .line 19
    .line 20
    invoke-interface {v1, p1}, LF3/j$b;->c(LF3/j$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, LF3/j$a;->n(Landroid/os/Handler;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    invoke-virtual {p1, v0}, LF3/j$a;->n(Landroid/os/Handler;)V

    .line 29
    .line 30
    .line 31
    throw v1
.end method
