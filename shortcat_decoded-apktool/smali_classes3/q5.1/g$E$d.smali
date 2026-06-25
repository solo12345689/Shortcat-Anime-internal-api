.class public final enum Lq5/g$E$d;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/g$E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum a:Lq5/g$E$d;

.field public static final enum b:Lq5/g$E$d;

.field public static final enum c:Lq5/g$E$d;

.field private static final synthetic d:[Lq5/g$E$d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lq5/g$E$d;

    .line 2
    .line 3
    const-string v1, "Miter"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lq5/g$E$d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lq5/g$E$d;->a:Lq5/g$E$d;

    .line 10
    .line 11
    new-instance v1, Lq5/g$E$d;

    .line 12
    .line 13
    const-string v2, "Round"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Lq5/g$E$d;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lq5/g$E$d;->b:Lq5/g$E$d;

    .line 20
    .line 21
    new-instance v2, Lq5/g$E$d;

    .line 22
    .line 23
    const-string v3, "Bevel"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Lq5/g$E$d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lq5/g$E$d;->c:Lq5/g$E$d;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lq5/g$E$d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lq5/g$E$d;->d:[Lq5/g$E$d;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq5/g$E$d;
    .locals 1

    .line 1
    const-class v0, Lq5/g$E$d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lq5/g$E$d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lq5/g$E$d;
    .locals 1

    .line 1
    sget-object v0, Lq5/g$E$d;->d:[Lq5/g$E$d;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lq5/g$E$d;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lq5/g$E$d;

    .line 8
    .line 9
    return-object v0
.end method
