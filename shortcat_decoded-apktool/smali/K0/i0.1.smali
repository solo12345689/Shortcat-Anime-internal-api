.class public final LK0/i0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/i0$a;,
        LK0/i0$b;,
        LK0/i0$c;,
        LK0/i0$d;,
        LK0/i0$e;
    }
.end annotation


# static fields
.field public static final a:LK0/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK0/i0;

    .line 2
    .line 3
    invoke-direct {v0}, LK0/i0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK0/i0;->a:LK0/i0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(LK0/i0$e;LI0/m;LI0/l;I)I
    .locals 9

    .line 1
    new-instance v0, LK0/i0$a;

    .line 2
    .line 3
    sget-object v1, LK0/i0$c;->b:LK0/i0$c;

    .line 4
    .line 5
    sget-object v2, LK0/i0$d;->b:LK0/i0$d;

    .line 6
    .line 7
    invoke-direct {v0, p3, v1, v2}, LK0/i0$a;-><init>(LI0/l;LK0/i0$c;LK0/i0$d;)V

    .line 8
    .line 9
    .line 10
    const/16 v7, 0xd

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    move v4, p4

    .line 17
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p3

    .line 21
    new-instance v1, Landroidx/compose/ui/layout/g;

    .line 22
    .line 23
    invoke-interface {p2}, LI0/m;->getLayoutDirection()Li1/t;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/g;-><init>(LI0/m;Li1/t;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v1, v0, p3, p4}, LK0/i0$e;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p1}, LI0/C;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
.end method

.method public final b(LK0/i0$e;LI0/m;LI0/l;I)I
    .locals 9

    .line 1
    new-instance v0, LK0/i0$a;

    .line 2
    .line 3
    sget-object v1, LK0/i0$c;->b:LK0/i0$c;

    .line 4
    .line 5
    sget-object v2, LK0/i0$d;->a:LK0/i0$d;

    .line 6
    .line 7
    invoke-direct {v0, p3, v1, v2}, LK0/i0$a;-><init>(LI0/l;LK0/i0$c;LK0/i0$d;)V

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x7

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move v6, p4

    .line 16
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 17
    .line 18
    .line 19
    move-result-wide p3

    .line 20
    new-instance v1, Landroidx/compose/ui/layout/g;

    .line 21
    .line 22
    invoke-interface {p2}, LI0/m;->getLayoutDirection()Li1/t;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/g;-><init>(LI0/m;Li1/t;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v1, v0, p3, p4}, LK0/i0$e;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1}, LI0/C;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method public final c(LK0/i0$e;LI0/m;LI0/l;I)I
    .locals 9

    .line 1
    new-instance v0, LK0/i0$a;

    .line 2
    .line 3
    sget-object v1, LK0/i0$c;->a:LK0/i0$c;

    .line 4
    .line 5
    sget-object v2, LK0/i0$d;->b:LK0/i0$d;

    .line 6
    .line 7
    invoke-direct {v0, p3, v1, v2}, LK0/i0$a;-><init>(LI0/l;LK0/i0$c;LK0/i0$d;)V

    .line 8
    .line 9
    .line 10
    const/16 v7, 0xd

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    move v4, p4

    .line 17
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p3

    .line 21
    new-instance v1, Landroidx/compose/ui/layout/g;

    .line 22
    .line 23
    invoke-interface {p2}, LI0/m;->getLayoutDirection()Li1/t;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/g;-><init>(LI0/m;Li1/t;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v1, v0, p3, p4}, LK0/i0$e;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p1}, LI0/C;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
.end method

.method public final d(LK0/i0$e;LI0/m;LI0/l;I)I
    .locals 9

    .line 1
    new-instance v0, LK0/i0$a;

    .line 2
    .line 3
    sget-object v1, LK0/i0$c;->a:LK0/i0$c;

    .line 4
    .line 5
    sget-object v2, LK0/i0$d;->a:LK0/i0$d;

    .line 6
    .line 7
    invoke-direct {v0, p3, v1, v2}, LK0/i0$a;-><init>(LI0/l;LK0/i0$c;LK0/i0$d;)V

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x7

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move v6, p4

    .line 16
    invoke-static/range {v3 .. v8}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 17
    .line 18
    .line 19
    move-result-wide p3

    .line 20
    new-instance v1, Landroidx/compose/ui/layout/g;

    .line 21
    .line 22
    invoke-interface {p2}, LI0/m;->getLayoutDirection()Li1/t;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v1, p2, v2}, Landroidx/compose/ui/layout/g;-><init>(LI0/m;Li1/t;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v1, v0, p3, p4}, LK0/i0$e;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1}, LI0/C;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method
