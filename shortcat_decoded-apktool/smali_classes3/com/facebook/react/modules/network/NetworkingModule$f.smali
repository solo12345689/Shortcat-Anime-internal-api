.class public final Lcom/facebook/react/modules/network/NetworkingModule$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lv7/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/NetworkingModule;->sendRequestInternalReal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic d:I


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->b:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    iput p3, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->d:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->a:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(JJZ)V
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    if-nez p5, :cond_0

    .line 6
    .line 7
    sget-object p5, Lcom/facebook/react/modules/network/NetworkingModule;->Companion:Lcom/facebook/react/modules/network/NetworkingModule$a;

    .line 8
    .line 9
    iget-wide v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->a:J

    .line 10
    .line 11
    invoke-static {p5, v0, v1, v2, v3}, Lcom/facebook/react/modules/network/NetworkingModule$a;->b(Lcom/facebook/react/modules/network/NetworkingModule$a;JJ)Z

    .line 12
    .line 13
    .line 14
    move-result p5

    .line 15
    if-nez p5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p5, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->b:Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "text"

    .line 21
    .line 22
    invoke-static {p5, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p5

    .line 26
    if-eqz p5, :cond_1

    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :cond_1
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 30
    .line 31
    iget v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->d:I

    .line 32
    .line 33
    move-wide v4, p1

    .line 34
    move-wide v6, p3

    .line 35
    invoke-static/range {v2 .. v7}, Lv7/e;->e(Lcom/facebook/react/bridge/ReactApplicationContext;IJJ)V

    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$f;->a:J

    .line 39
    .line 40
    return-void
.end method
