.class public final Ld0/t$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ld0/t;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ld0/t;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld0/t$b;->a:Ld0/t;

    .line 5
    .line 6
    iput p2, p0, Ld0/t$b;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ld0/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/t$b;->a:Ld0/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Ld0/t$b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final c(Ld0/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/t$b;->a:Ld0/t;

    .line 2
    .line 3
    return-void
.end method
