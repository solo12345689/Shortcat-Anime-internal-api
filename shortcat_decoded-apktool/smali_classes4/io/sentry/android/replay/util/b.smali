.class public final Lio/sentry/android/replay/util/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/android/replay/util/q;


# static fields
.field public static final c:I


# instance fields
.field private final a:LU0/T0;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, LU0/T0;->g:I

    .line 2
    .line 3
    sput v0, Lio/sentry/android/replay/util/b;->c:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(LU0/T0;Z)V
    .locals 1

    .line 1
    const-string v0, "layout"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 10
    .line 11
    iput-boolean p2, p0, Lio/sentry/android/replay/util/b;->b:Z

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU0/T0;->v(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Lke/a;->d(F)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public b(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU0/T0;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 2
    .line 3
    invoke-virtual {v0}, LU0/T0;->n()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d(II)F
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p2, v1}, LU0/T0;->j(IZ)F

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    iget-boolean v0, p0, Lio/sentry/android/replay/util/b;->b:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/sentry/android/replay/util/b;->c()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LU0/T0;->s(I)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    sub-float/2addr p2, p1

    .line 25
    :cond_0
    return p2
.end method

.method public e(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU0/T0;->m(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Lke/a;->d(F)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public f()Ljava/lang/Integer;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public g(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, LU0/T0;->o(IZ)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public h(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/util/b;->a:LU0/T0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU0/T0;->D(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
