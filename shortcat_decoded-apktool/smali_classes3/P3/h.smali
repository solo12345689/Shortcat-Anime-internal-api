.class public final LP3/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP3/h$a;
    }
.end annotation


# static fields
.field public static final c:LP3/h$a;


# instance fields
.field private final a:LR3/b;

.field private final b:LP3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP3/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LP3/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LP3/h;->c:LP3/h$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(LR3/b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LP3/h;->a:LR3/b;

    .line 4
    new-instance v0, LP3/f;

    invoke-direct {v0, p1}, LP3/f;-><init>(LR3/b;)V

    iput-object v0, p0, LP3/h;->b:LP3/f;

    return-void
.end method

.method public synthetic constructor <init>(LR3/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP3/h;-><init>(LR3/b;)V

    return-void
.end method

.method public static final a(LP3/i;)LP3/h;
    .locals 1

    .line 1
    sget-object v0, LP3/h;->c:LP3/h$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LP3/h$a;->b(LP3/i;)LP3/h;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final b()LP3/f;
    .locals 1

    .line 1
    iget-object v0, p0, LP3/h;->b:LP3/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, LP3/h;->a:LR3/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LR3/b;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP3/h;->a:LR3/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR3/b;->h(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "outBundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP3/h;->a:LR3/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LR3/b;->i(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
