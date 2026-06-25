.class public abstract LJ1/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ1/o$e;,
        LJ1/o$c;,
        LJ1/o$b;,
        LJ1/o$a;,
        LJ1/o$f;,
        LJ1/o$d;
    }
.end annotation


# static fields
.field public static final a:LJ1/n;

.field public static final b:LJ1/n;

.field public static final c:LJ1/n;

.field public static final d:LJ1/n;

.field public static final e:LJ1/n;

.field public static final f:LJ1/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LJ1/o$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, LJ1/o$e;-><init>(LJ1/o$c;Z)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LJ1/o;->a:LJ1/n;

    .line 9
    .line 10
    new-instance v0, LJ1/o$e;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v0, v1, v3}, LJ1/o$e;-><init>(LJ1/o$c;Z)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LJ1/o;->b:LJ1/n;

    .line 17
    .line 18
    new-instance v0, LJ1/o$e;

    .line 19
    .line 20
    sget-object v1, LJ1/o$b;->a:LJ1/o$b;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, LJ1/o$e;-><init>(LJ1/o$c;Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, LJ1/o;->c:LJ1/n;

    .line 26
    .line 27
    new-instance v0, LJ1/o$e;

    .line 28
    .line 29
    invoke-direct {v0, v1, v3}, LJ1/o$e;-><init>(LJ1/o$c;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LJ1/o;->d:LJ1/n;

    .line 33
    .line 34
    new-instance v0, LJ1/o$e;

    .line 35
    .line 36
    sget-object v1, LJ1/o$a;->b:LJ1/o$a;

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, LJ1/o$e;-><init>(LJ1/o$c;Z)V

    .line 39
    .line 40
    .line 41
    sput-object v0, LJ1/o;->e:LJ1/n;

    .line 42
    .line 43
    sget-object v0, LJ1/o$f;->b:LJ1/o$f;

    .line 44
    .line 45
    sput-object v0, LJ1/o;->f:LJ1/n;

    .line 46
    .line 47
    return-void
.end method

.method static a(I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    return v0
.end method

.method static b(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_0

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    :pswitch_0
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_1
    :pswitch_1
    return v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
