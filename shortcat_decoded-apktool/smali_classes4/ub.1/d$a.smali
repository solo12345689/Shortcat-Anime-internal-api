.class public final Lub/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lub/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/d;->g(Lkotlin/jvm/functions/Function1;)Lub/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lub/d;

.field final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(JLub/d;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lub/d$a;->a:J

    .line 2
    .line 3
    iput-object p3, p0, Lub/d$a;->b:Lub/d;

    .line 4
    .line 5
    iput-object p4, p0, Lub/d$a;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()J
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lub/d$a;->a:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    iget-object v2, p0, Lub/d$a;->b:Lub/d;

    .line 9
    .line 10
    sget-object v3, Lub/c;->d:Lub/c;

    .line 11
    .line 12
    iget-object v4, p0, Lub/d$a;->c:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ljava/lang/String;

    .line 23
    .line 24
    const/4 v6, 0x4

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-static/range {v2 .. v7}, Lub/d;->f(Lub/d;Lub/c;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v2, LEf/d;->d:LEf/d;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, LEf/c;->t(JLEf/d;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0
.end method
