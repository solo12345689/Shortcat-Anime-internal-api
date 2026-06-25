.class public final LW1/g$a;
.super Landroidx/datastore/preferences/protobuf/t$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, LW1/g;->O()LW1/g;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/t$a;-><init>(Landroidx/datastore/preferences/protobuf/t;)V

    return-void
.end method

.method synthetic constructor <init>(LW1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LW1/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public s(Ljava/lang/Iterable;)LW1/g$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/t$a;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t$a;->b:Landroidx/datastore/preferences/protobuf/t;

    .line 5
    .line 6
    check-cast v0, LW1/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, LW1/g;->P(LW1/g;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
