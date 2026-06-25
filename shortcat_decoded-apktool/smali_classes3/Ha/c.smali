.class public abstract LHa/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, LHa/b;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lpe/d;->u()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LHa/c;->a:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v0, Lza/a;->a:Lza/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lza/a;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    xor-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    sput-boolean v0, LHa/c;->b:Z

    .line 22
    .line 23
    return-void
.end method

.method public static final synthetic a()Z
    .locals 1

    .line 1
    sget-boolean v0, LHa/c;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LHa/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
