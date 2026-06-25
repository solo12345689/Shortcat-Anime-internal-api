.class abstract LW1/f$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Landroidx/datastore/preferences/protobuf/D;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/m0$b;->k:Landroidx/datastore/preferences/protobuf/m0$b;

    .line 2
    .line 3
    sget-object v1, Landroidx/datastore/preferences/protobuf/m0$b;->m:Landroidx/datastore/preferences/protobuf/m0$b;

    .line 4
    .line 5
    invoke-static {}, LW1/h;->Z()LW1/h;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    invoke-static {v0, v3, v1, v2}, Landroidx/datastore/preferences/protobuf/D;->d(Landroidx/datastore/preferences/protobuf/m0$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/m0$b;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/D;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LW1/f$b;->a:Landroidx/datastore/preferences/protobuf/D;

    .line 16
    .line 17
    return-void
.end method
