.class public final LE3/h3$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/h3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/h3$e$a;
    }
.end annotation


# static fields
.field public static final h:LE3/U6;

.field public static final i:LE3/U6;

.field public static final j:Lq2/P$b;


# instance fields
.field public final a:Z

.field public final b:LE3/U6;

.field public final c:Lq2/P$b;

.field public final d:LP9/u;

.field public final e:LP9/u;

.field public final f:Landroid/os/Bundle;

.field public final g:Landroid/app/PendingIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LE3/U6$b;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/U6$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LE3/U6$b;->c()LE3/U6$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, LE3/U6$b;->e()LE3/U6;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LE3/h3$e;->h:LE3/U6;

    .line 15
    .line 16
    new-instance v0, LE3/U6$b;

    .line 17
    .line 18
    invoke-direct {v0}, LE3/U6$b;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LE3/U6$b;->b()LE3/U6$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LE3/U6$b;->c()LE3/U6$b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, LE3/U6$b;->e()LE3/U6;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, LE3/h3$e;->i:LE3/U6;

    .line 34
    .line 35
    new-instance v0, Lq2/P$b$a;

    .line 36
    .line 37
    invoke-direct {v0}, Lq2/P$b$a;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lq2/P$b$a;->d()Lq2/P$b$a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, LE3/h3$e;->j:Lq2/P$b;

    .line 49
    .line 50
    return-void
.end method

.method private constructor <init>(ZLE3/U6;Lq2/P$b;LP9/u;LP9/u;Landroid/os/Bundle;Landroid/app/PendingIntent;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LE3/h3$e;->a:Z

    .line 4
    iput-object p2, p0, LE3/h3$e;->b:LE3/U6;

    .line 5
    iput-object p3, p0, LE3/h3$e;->c:Lq2/P$b;

    .line 6
    iput-object p4, p0, LE3/h3$e;->d:LP9/u;

    .line 7
    iput-object p5, p0, LE3/h3$e;->e:LP9/u;

    .line 8
    iput-object p6, p0, LE3/h3$e;->f:Landroid/os/Bundle;

    .line 9
    iput-object p7, p0, LE3/h3$e;->g:Landroid/app/PendingIntent;

    return-void
.end method

.method synthetic constructor <init>(ZLE3/U6;Lq2/P$b;LP9/u;LP9/u;Landroid/os/Bundle;Landroid/app/PendingIntent;LE3/h3$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LE3/h3$e;-><init>(ZLE3/U6;Lq2/P$b;LP9/u;LP9/u;Landroid/os/Bundle;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public static a(LE3/U6;Lq2/P$b;)LE3/h3$e;
    .locals 8

    .line 1
    new-instance v0, LE3/h3$e;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    move-object v2, p0

    .line 9
    move-object v3, p1

    .line 10
    invoke-direct/range {v0 .. v7}, LE3/h3$e;-><init>(ZLE3/U6;Lq2/P$b;LP9/u;LP9/u;Landroid/os/Bundle;Landroid/app/PendingIntent;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static b()LE3/h3$e;
    .locals 8

    .line 1
    new-instance v0, LE3/h3$e;

    .line 2
    .line 3
    sget-object v2, LE3/U6;->b:LE3/U6;

    .line 4
    .line 5
    sget-object v3, Lq2/P$b;->b:Lq2/P$b;

    .line 6
    .line 7
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct/range {v0 .. v7}, LE3/h3$e;-><init>(ZLE3/U6;Lq2/P$b;LP9/u;LP9/u;Landroid/os/Bundle;Landroid/app/PendingIntent;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
