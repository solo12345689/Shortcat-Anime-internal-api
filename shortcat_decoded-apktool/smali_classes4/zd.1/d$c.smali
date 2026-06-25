.class final Lzd/d$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/d;->h(Lexpo/modules/updates/db/UpdatesDatabase;Lzd/j$a;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field final synthetic b:Lzd/d;

.field c:I


# direct methods
.method constructor <init>(Lzd/d;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/d$c;->b:Lzd/d;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(LZd/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lzd/d$c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lzd/d$c;->c:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lzd/d$c;->c:I

    .line 9
    .line 10
    iget-object p1, p0, Lzd/d$c;->b:Lzd/d;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, v0, p0}, Lzd/d;->f(Lzd/d;Lexpo/modules/updates/db/UpdatesDatabase;Lzd/j$a;LZd/e;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
