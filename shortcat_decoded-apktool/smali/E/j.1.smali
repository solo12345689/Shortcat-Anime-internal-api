.class public final LE/j;
.super LF/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE/C;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE/j$b;
    }
.end annotation


# static fields
.field private static final d:LE/j$b;

.field public static final e:I

.field private static final f:Lkotlin/jvm/functions/Function2;


# instance fields
.field private final a:LE/H;

.field private final b:LF/G;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LE/j$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LE/j$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LE/j;->d:LE/j$b;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LE/j;->e:I

    .line 12
    .line 13
    sget-object v0, LE/j$a;->a:LE/j$a;

    .line 14
    .line 15
    sput-object v0, LE/j;->f:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LF/m;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE/H;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LE/H;-><init>(LE/j;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE/j;->a:LE/H;

    .line 10
    .line 11
    new-instance v0, LF/G;

    .line 12
    .line 13
    invoke-direct {v0}, LF/G;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LE/j;->b:LF/G;

    .line 17
    .line 18
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lie/p;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LE/j;->k()LF/G;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE/i;

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    sget-object v2, LE/j;->f:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v2, p3

    .line 13
    :goto_0
    invoke-direct {v1, p2, v2, p4, p5}, LE/i;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lie/p;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, LF/G;->b(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LE/j;->c:Z

    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public bridge synthetic g()LF/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE/j;->k()LF/G;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE/j;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public k()LF/G;
    .locals 1

    .line 1
    iget-object v0, p0, LE/j;->b:LF/G;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()LE/H;
    .locals 1

    .line 1
    iget-object v0, p0, LE/j;->a:LE/H;

    .line 2
    .line 3
    return-object v0
.end method
