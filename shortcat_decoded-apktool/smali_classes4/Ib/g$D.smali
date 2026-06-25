.class public final LIb/g$D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIb/g;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final a:LIb/g$D;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LIb/g$D;

    .line 2
    .line 3
    invoke-direct {v0}, LIb/g$D;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LIb/g$D;->a:LIb/g$D;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lpe/q;
    .locals 3

    .line 1
    sget-object v0, Lpe/s;->c:Lpe/s$a;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/O;->o(Ljava/lang/Class;)Lpe/q;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v0, v2}, Lpe/s$a;->d(Lpe/q;)Lpe/s;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/O;->o(Ljava/lang/Class;)Lpe/q;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lpe/s$a;->d(Lpe/q;)Lpe/s;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, Ljava/util/Map;

    .line 22
    .line 23
    invoke-static {v1, v2, v0}, Lkotlin/jvm/internal/O;->h(Ljava/lang/Class;Lpe/s;Lpe/s;)Lpe/q;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LIb/g$D;->a()Lpe/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
