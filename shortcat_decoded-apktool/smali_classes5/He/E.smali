.class public final LHe/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/util/EnumMap;


# direct methods
.method public constructor <init>(Ljava/util/EnumMap;)V
    .locals 1

    .line 1
    const-string v0, "defaultQualifiers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LHe/E;->a:Ljava/util/EnumMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(LHe/c;)LHe/w;
    .locals 1

    .line 1
    iget-object v0, p0, LHe/E;->a:Ljava/util/EnumMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LHe/w;

    .line 8
    .line 9
    return-object p1
.end method

.method public final b()Ljava/util/EnumMap;
    .locals 1

    .line 1
    iget-object v0, p0, LHe/E;->a:Ljava/util/EnumMap;

    .line 2
    .line 3
    return-object v0
.end method
