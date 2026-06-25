.class public abstract Lio/sentry/android/replay/viewhierarchy/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/replay/viewhierarchy/b$a;,
        Lio/sentry/android/replay/viewhierarchy/b$b;,
        Lio/sentry/android/replay/viewhierarchy/b$c;,
        Lio/sentry/android/replay/viewhierarchy/b$d;
    }
.end annotation


# static fields
.field public static final m:Lio/sentry/android/replay/viewhierarchy/b$a;

.field public static final n:I


# instance fields
.field private final a:F

.field private final b:F

.field private final c:I

.field private final d:I

.field private final e:F

.field private final f:I

.field private final g:Lio/sentry/android/replay/viewhierarchy/b;

.field private final h:Z

.field private i:Z

.field private final j:Z

.field private final k:Landroid/graphics/Rect;

.field private l:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lio/sentry/android/replay/viewhierarchy/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lio/sentry/android/replay/viewhierarchy/b;->m:Lio/sentry/android/replay/viewhierarchy/b$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lio/sentry/android/replay/viewhierarchy/b;->n:I

    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/sentry/android/replay/viewhierarchy/b;->a:F

    .line 4
    iput p2, p0, Lio/sentry/android/replay/viewhierarchy/b;->b:F

    .line 5
    iput p3, p0, Lio/sentry/android/replay/viewhierarchy/b;->c:I

    .line 6
    iput p4, p0, Lio/sentry/android/replay/viewhierarchy/b;->d:I

    .line 7
    iput p5, p0, Lio/sentry/android/replay/viewhierarchy/b;->e:F

    .line 8
    iput p6, p0, Lio/sentry/android/replay/viewhierarchy/b;->f:I

    .line 9
    iput-object p7, p0, Lio/sentry/android/replay/viewhierarchy/b;->g:Lio/sentry/android/replay/viewhierarchy/b;

    .line 10
    iput-boolean p8, p0, Lio/sentry/android/replay/viewhierarchy/b;->h:Z

    .line 11
    iput-boolean p9, p0, Lio/sentry/android/replay/viewhierarchy/b;->i:Z

    .line 12
    iput-boolean p10, p0, Lio/sentry/android/replay/viewhierarchy/b;->j:Z

    .line 13
    iput-object p11, p0, Lio/sentry/android/replay/viewhierarchy/b;->k:Landroid/graphics/Rect;

    return-void
.end method

.method public synthetic constructor <init>(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lio/sentry/android/replay/viewhierarchy/b;-><init>(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget v0, p0, Lio/sentry/android/replay/viewhierarchy/b;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lio/sentry/android/replay/viewhierarchy/b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/replay/viewhierarchy/b;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/viewhierarchy/b;->k:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lio/sentry/android/replay/viewhierarchy/b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final f(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/viewhierarchy/b;->l:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final g(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/viewhierarchy/b;->g:Lio/sentry/android/replay/viewhierarchy/b;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, v0, Lio/sentry/android/replay/viewhierarchy/b;->i:Z

    .line 6
    .line 7
    iget-object v0, v0, Lio/sentry/android/replay/viewhierarchy/b;->g:Lio/sentry/android/replay/viewhierarchy/b;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void
.end method

.method public final h(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lio/sentry/android/replay/viewhierarchy/b;->l:Ljava/util/List;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lio/sentry/android/replay/viewhierarchy/b;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lio/sentry/android/replay/viewhierarchy/b;->h(Lkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method
