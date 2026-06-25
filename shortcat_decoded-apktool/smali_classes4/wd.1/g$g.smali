.class final Lwd/g$g;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd/g;->o(Lrd/a;Lorg/json/JSONObject;Ldg/C;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Lwd/b;ZLrd/d;Lrd/d;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field g:Ljava/lang/Object;

.field h:Ljava/lang/Object;

.field i:Ljava/lang/Object;

.field j:Z

.field synthetic k:Ljava/lang/Object;

.field final synthetic l:Lwd/g;

.field m:I


# direct methods
.method constructor <init>(Lwd/g;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwd/g$g;->l:Lwd/g;

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
    .locals 12

    .line 1
    iput-object p1, p0, Lwd/g$g;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lwd/g$g;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lwd/g$g;->m:I

    .line 9
    .line 10
    iget-object v0, p0, Lwd/g$g;->l:Lwd/g;

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    move-object v11, p0

    .line 23
    invoke-virtual/range {v0 .. v11}, Lwd/g;->o(Lrd/a;Lorg/json/JSONObject;Ldg/C;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Lwd/b;ZLrd/d;Lrd/d;LZd/e;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method
