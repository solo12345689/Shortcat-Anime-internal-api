.class public final Lmd/f$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/f;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmd/f;


# direct methods
.method public constructor <init>(Lmd/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd/f$h;->a:Lmd/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object v1, p1, v1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    aget-object v2, p1, v2

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    aget-object v3, p1, v3

    .line 17
    .line 18
    const/4 v4, 0x4

    .line 19
    aget-object p1, p1, v4

    .line 20
    .line 21
    move-object v10, p1

    .line 22
    check-cast v10, Ljava/util/Map;

    .line 23
    .line 24
    move-object v9, v3

    .line 25
    check-cast v9, Ljava/lang/Integer;

    .line 26
    .line 27
    move-object v8, v2

    .line 28
    check-cast v8, Ljava/lang/Integer;

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    move-object v5, v0

    .line 37
    check-cast v5, Ljava/lang/String;

    .line 38
    .line 39
    iget-object v4, p0, Lmd/f$h;->a:Lmd/f;

    .line 40
    .line 41
    invoke-static/range {v4 .. v10}, Lmd/f;->z(Lmd/f;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmd/f$h;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
