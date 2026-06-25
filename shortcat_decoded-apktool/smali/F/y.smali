.class public final LF/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/h2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/y$a;
    }
.end annotation


# static fields
.field private static final e:LF/y$a;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:LY/C0;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LF/y$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LF/y$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LF/y;->e:LF/y$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(III)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, LF/y;->a:I

    .line 5
    .line 6
    iput p3, p0, LF/y;->b:I

    .line 7
    .line 8
    sget-object v0, LF/y;->e:LF/y$a;

    .line 9
    .line 10
    invoke-static {v0, p1, p2, p3}, LF/y$a;->a(LF/y$a;III)Loe/f;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-static {p2, p3}, LY/U1;->h(Ljava/lang/Object;LY/T1;)LY/C0;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iput-object p2, p0, LF/y;->c:LY/C0;

    .line 23
    .line 24
    iput p1, p0, LF/y;->d:I

    .line 25
    .line 26
    return-void
.end method

.method private l(Loe/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/y;->c:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF/y;->i()Loe/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public i()Loe/f;
    .locals 1

    .line 1
    iget-object v0, p0, LF/y;->c:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Loe/f;

    .line 8
    .line 9
    return-object v0
.end method

.method public final n(I)V
    .locals 3

    .line 1
    iget v0, p0, LF/y;->d:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, LF/y;->d:I

    .line 6
    .line 7
    sget-object v0, LF/y;->e:LF/y$a;

    .line 8
    .line 9
    iget v1, p0, LF/y;->a:I

    .line 10
    .line 11
    iget v2, p0, LF/y;->b:I

    .line 12
    .line 13
    invoke-static {v0, p1, v1, v2}, LF/y$a;->a(LF/y$a;III)Loe/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, LF/y;->l(Loe/f;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
