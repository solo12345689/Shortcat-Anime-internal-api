.class LF3/g$n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "n"
.end annotation


# instance fields
.field final synthetic a:LF3/g;


# direct methods
.method constructor <init>(LF3/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$n;->a:LF3/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;LF3/g$o;)V
    .locals 7

    .line 1
    iget-object v0, p0, LF3/g$n;->a:LF3/g;

    .line 2
    .line 3
    iget-object v0, v0, LF3/g;->g:LF3/g$q;

    .line 4
    .line 5
    new-instance v1, LF3/g$n$a;

    .line 6
    .line 7
    move-object v2, p0

    .line 8
    move-object v4, p1

    .line 9
    move-object v5, p2

    .line 10
    move-object v6, p3

    .line 11
    move-object v3, p4

    .line 12
    invoke-direct/range {v1 .. v6}, LF3/g$n$a;-><init>(LF3/g$n;LF3/g$o;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, LF3/g$q;->a(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b(Ljava/lang/String;Ld/b;LF3/g$o;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, LF3/g$n;->a:LF3/g;

    .line 11
    .line 12
    iget-object v0, v0, LF3/g;->g:LF3/g$q;

    .line 13
    .line 14
    new-instance v1, LF3/g$n$c;

    .line 15
    .line 16
    invoke-direct {v1, p0, p3, p1, p2}, LF3/g$n$c;-><init>(LF3/g$n;LF3/g$o;Ljava/lang/String;Ld/b;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, LF3/g$q;->a(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public c(LF3/g$o;Ljava/lang/String;IILandroid/os/Bundle;)V
    .locals 8

    .line 1
    iget-object v0, p0, LF3/g$n;->a:LF3/g;

    .line 2
    .line 3
    iget-object v0, v0, LF3/g;->g:LF3/g$q;

    .line 4
    .line 5
    new-instance v1, LF3/g$n$d;

    .line 6
    .line 7
    move-object v2, p0

    .line 8
    move-object v3, p1

    .line 9
    move-object v5, p2

    .line 10
    move v6, p3

    .line 11
    move v4, p4

    .line 12
    move-object v7, p5

    .line 13
    invoke-direct/range {v1 .. v7}, LF3/g$n$d;-><init>(LF3/g$n;LF3/g$o;ILjava/lang/String;ILandroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, LF3/g$q;->a(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public d(Ljava/lang/String;Landroid/os/IBinder;LF3/g$o;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/g$n;->a:LF3/g;

    .line 2
    .line 3
    iget-object v0, v0, LF3/g;->g:LF3/g$q;

    .line 4
    .line 5
    new-instance v1, LF3/g$n$b;

    .line 6
    .line 7
    invoke-direct {v1, p0, p3, p1, p2}, LF3/g$n$b;-><init>(LF3/g$n;LF3/g$o;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LF3/g$q;->a(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public e(Ljava/lang/String;Landroid/os/Bundle;Ld/b;LF3/g$o;)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, LF3/g$n;->a:LF3/g;

    .line 11
    .line 12
    iget-object v0, v0, LF3/g;->g:LF3/g$q;

    .line 13
    .line 14
    new-instance v1, LF3/g$n$f;

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    move-object v4, p1

    .line 18
    move-object v5, p2

    .line 19
    move-object v6, p3

    .line 20
    move-object v3, p4

    .line 21
    invoke-direct/range {v1 .. v6}, LF3/g$n$f;-><init>(LF3/g$n;LF3/g$o;Ljava/lang/String;Landroid/os/Bundle;Ld/b;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, LF3/g$q;->a(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public f(Ljava/lang/String;Landroid/os/Bundle;Ld/b;LF3/g$o;)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, LF3/g$n;->a:LF3/g;

    .line 11
    .line 12
    iget-object v0, v0, LF3/g;->g:LF3/g$q;

    .line 13
    .line 14
    new-instance v1, LF3/g$n$g;

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    move-object v4, p1

    .line 18
    move-object v5, p2

    .line 19
    move-object v6, p3

    .line 20
    move-object v3, p4

    .line 21
    invoke-direct/range {v1 .. v6}, LF3/g$n$g;-><init>(LF3/g$n;LF3/g$o;Ljava/lang/String;Landroid/os/Bundle;Ld/b;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, LF3/g$q;->a(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public g(LF3/g$o;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/g$n;->a:LF3/g;

    .line 2
    .line 3
    iget-object v0, v0, LF3/g;->g:LF3/g$q;

    .line 4
    .line 5
    new-instance v1, LF3/g$n$e;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LF3/g$n$e;-><init>(LF3/g$n;LF3/g$o;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LF3/g$q;->a(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
