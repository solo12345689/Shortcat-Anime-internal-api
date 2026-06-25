.class LHg/i$a;
.super Ljava/lang/Object;

# interfaces
.implements LFg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:LFg/d;


# direct methods
.method public constructor <init>(ILjava/lang/String;LFg/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LHg/i$a;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LHg/i$a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LHg/i$a;->c:LFg/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LHg/i$a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
