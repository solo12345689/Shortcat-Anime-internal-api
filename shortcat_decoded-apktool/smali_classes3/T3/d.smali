.class public final LT3/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS3/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT3/d$a;,
        LT3/d$b;,
        LT3/d$c;
    }
.end annotation


# static fields
.field public static final h:LT3/d$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:LS3/h$a;

.field private final d:Z

.field private final e:Z

.field private final f:Lkotlin/Lazy;

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LT3/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LT3/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LT3/d;->h:LT3/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LS3/h$a;ZZ)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LT3/d;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, LT3/d;->b:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p3, p0, LT3/d;->c:LS3/h$a;

    .line 19
    .line 20
    iput-boolean p4, p0, LT3/d;->d:Z

    .line 21
    .line 22
    iput-boolean p5, p0, LT3/d;->e:Z

    .line 23
    .line 24
    new-instance p1, LT3/d$d;

    .line 25
    .line 26
    invoke-direct {p1, p0}, LT3/d$d;-><init>(LT3/d;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, LT3/d;->f:Lkotlin/Lazy;

    .line 34
    .line 35
    return-void
.end method

.method public static final synthetic a(LT3/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LT3/d;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic b(LT3/d;)LS3/h$a;
    .locals 0

    .line 1
    iget-object p0, p0, LT3/d;->c:LS3/h$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(LT3/d;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LT3/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(LT3/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LT3/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(LT3/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LT3/d;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic k(LT3/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LT3/d;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method private final l()LT3/d$c;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/d;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LT3/d$c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, LT3/d;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LT3/d;->l()LT3/d$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LT3/d$c;->close()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWritableDatabase()LS3/g;
    .locals 2

    .line 1
    invoke-direct {p0}, LT3/d;->l()LT3/d$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, LT3/d$c;->g(Z)LS3/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LT3/d;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LT3/d;->l()LT3/d$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, LS3/b;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-boolean p1, p0, LT3/d;->g:Z

    .line 17
    .line 18
    return-void
.end method
