.class final LT1/n$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT1/n;->i(LT1/n;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:LT1/n;

.field e:I


# direct methods
.method constructor <init>(LT1/n;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT1/n$a;->d:LT1/n;

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
    iput-object p1, p0, LT1/n$a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LT1/n$a;->e:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LT1/n$a;->e:I

    .line 9
    .line 10
    iget-object p1, p0, LT1/n$a;->d:LT1/n;

    .line 11
    .line 12
    invoke-static {p1, p0}, LT1/n;->i(LT1/n;LZd/e;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
