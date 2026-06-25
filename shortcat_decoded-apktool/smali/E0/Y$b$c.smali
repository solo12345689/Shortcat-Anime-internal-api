.class final LE0/Y$b$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/Y$b;->d1(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field final synthetic b:LE0/Y$b;

.field c:I


# direct methods
.method constructor <init>(LE0/Y$b;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/Y$b$c;->b:LE0/Y$b;

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
    .locals 3

    .line 1
    iput-object p1, p0, LE0/Y$b$c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LE0/Y$b$c;->c:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LE0/Y$b$c;->c:I

    .line 9
    .line 10
    iget-object p1, p0, LE0/Y$b$c;->b:LE0/Y$b;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p1, v0, v1, v2, p0}, LE0/Y$b;->d1(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
