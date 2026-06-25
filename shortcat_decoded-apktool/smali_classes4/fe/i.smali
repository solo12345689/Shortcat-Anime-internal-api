.class public final Lfe/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LCf/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfe/i$a;,
        Lfe/i$b;,
        Lfe/i$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Lfe/j;

.field private final c:Lkotlin/jvm/functions/Function1;

.field private final d:Lkotlin/jvm/functions/Function1;

.field private final e:Lkotlin/jvm/functions/Function2;

.field private final f:I


# direct methods
.method public constructor <init>(Ljava/io/File;Lfe/j;)V
    .locals 10

    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    .line 10
    invoke-direct/range {v1 .. v9}, Lfe/i;-><init>(Ljava/io/File;Lfe/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/File;Lfe/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfe/i;->a:Ljava/io/File;

    .line 3
    iput-object p2, p0, Lfe/i;->b:Lfe/j;

    .line 4
    iput-object p3, p0, Lfe/i;->c:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object p4, p0, Lfe/i;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    iput-object p5, p0, Lfe/i;->e:Lkotlin/jvm/functions/Function2;

    .line 7
    iput p6, p0, Lfe/i;->f:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/io/File;Lfe/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 8
    sget-object p2, Lfe/j;->a:Lfe/j;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_1

    const p6, 0x7fffffff

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lfe/i;-><init>(Ljava/io/File;Lfe/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V

    return-void
.end method

.method public static final synthetic c(Lfe/i;)Lfe/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lfe/i;->b:Lfe/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lfe/i;)I
    .locals 0

    .line 1
    iget p0, p0, Lfe/i;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic e(Lfe/i;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lfe/i;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lfe/i;)Lkotlin/jvm/functions/Function2;
    .locals 0

    .line 1
    iget-object p0, p0, Lfe/i;->e:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lfe/i;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lfe/i;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lfe/i;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lfe/i;->a:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final i(Lkotlin/jvm/functions/Function2;)Lfe/i;
    .locals 8

    .line 1
    const-string v0, "function"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lfe/i;

    .line 7
    .line 8
    iget-object v2, p0, Lfe/i;->a:Ljava/io/File;

    .line 9
    .line 10
    iget-object v3, p0, Lfe/i;->b:Lfe/j;

    .line 11
    .line 12
    iget-object v4, p0, Lfe/i;->c:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iget-object v5, p0, Lfe/i;->d:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget v7, p0, Lfe/i;->f:I

    .line 17
    .line 18
    move-object v6, p1

    .line 19
    invoke-direct/range {v1 .. v7}, Lfe/i;-><init>(Ljava/io/File;Lfe/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lfe/i$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lfe/i$b;-><init>(Lfe/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
