.class public final LE0/M;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE0/J;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/M$a;
    }
.end annotation


# instance fields
.field public b:Lkotlin/jvm/functions/Function1;

.field private c:LE0/U;

.field private d:Z

.field private final e:LE0/I;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE0/M$b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LE0/M$b;-><init>(LE0/M;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE0/M;->e:LE0/I;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE0/M;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/M;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "onTouchEvent"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public g()LE0/I;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/M;->e:LE0/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LE0/M;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public final i(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/M;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final j(LE0/U;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE0/M;->c:LE0/U;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, LE0/U;->b(LE0/M;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object p1, p0, LE0/M;->c:LE0/U;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, p0}, LE0/U;->b(LE0/M;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method
