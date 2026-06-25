.class public Lb5/X;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS4/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb5/X$a;
    }
.end annotation


# instance fields
.field private final a:Lb5/r;

.field private final b:LV4/b;


# direct methods
.method public constructor <init>(Lb5/r;LV4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/X;->a:Lb5/r;

    .line 5
    .line 6
    iput-object p2, p0, Lb5/X;->b:LV4/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILS4/h;)LU4/v;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lb5/X;->c(Ljava/io/InputStream;IILS4/h;)LU4/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;LS4/h;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lb5/X;->d(Ljava/io/InputStream;LS4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Ljava/io/InputStream;IILS4/h;)LU4/v;
    .locals 9

    .line 1
    instance-of v0, p1, Lb5/V;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lb5/V;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lb5/V;

    .line 11
    .line 12
    iget-object v1, p0, Lb5/X;->b:LV4/b;

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, Lb5/V;-><init>(Ljava/io/InputStream;LV4/b;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    move v1, p1

    .line 19
    move-object p1, v0

    .line 20
    :goto_0
    invoke-static {p1}, Lo5/d;->b(Ljava/io/InputStream;)Lo5/d;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v4, Lo5/i;

    .line 25
    .line 26
    invoke-direct {v4, v2}, Lo5/i;-><init>(Ljava/io/InputStream;)V

    .line 27
    .line 28
    .line 29
    new-instance v8, Lb5/X$a;

    .line 30
    .line 31
    invoke-direct {v8, p1, v2}, Lb5/X$a;-><init>(Lb5/V;Lo5/d;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object v3, p0, Lb5/X;->a:Lb5/r;

    .line 35
    .line 36
    move v5, p2

    .line 37
    move v6, p3

    .line 38
    move-object v7, p4

    .line 39
    invoke-virtual/range {v3 .. v8}, Lb5/r;->f(Ljava/io/InputStream;IILS4/h;Lb5/r$b;)LU4/v;

    .line 40
    .line 41
    .line 42
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-virtual {v2}, Lo5/d;->g()V

    .line 44
    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Lb5/V;->g()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-object p2

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p2, v0

    .line 54
    invoke-virtual {v2}, Lo5/d;->g()V

    .line 55
    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Lb5/V;->g()V

    .line 60
    .line 61
    .line 62
    :cond_2
    throw p2
.end method

.method public d(Ljava/io/InputStream;LS4/h;)Z
    .locals 0

    .line 1
    iget-object p2, p0, Lb5/X;->a:Lb5/r;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lb5/r;->p(Ljava/io/InputStream;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
